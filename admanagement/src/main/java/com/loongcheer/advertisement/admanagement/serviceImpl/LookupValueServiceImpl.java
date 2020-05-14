package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.LookupValueMapper;
import com.loongcheer.advertisement.admanagement.service.LookupValueService;
import com.loongcheer.advertisement.api.entity.LookupValue;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupValueSave;
import com.loongcheer.advertisement.api.form.update.LookupTypeUpdate;
import com.loongcheer.advertisement.api.form.update.LookupValueUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@Service
public class LookupValueServiceImpl extends ServiceImpl<LookupValueMapper, LookupValue> implements LookupValueService {

    @Override
    public ResultCommon queryLookupValue() {
        return null;
    }

    @Transactional
    @Override
    public ResultCommon addLookupValue(LookupValueSave lookupValueSave) {
        int count = baseMapper.selectCount(new QueryWrapper<LookupValue>().eq("lookup_type_code",lookupValueSave.getLookupTypeCode()).eq("lookup_value_code",lookupValueSave.getLookupValueCode()));
        if(count>0){
            return ResultCommon.error("该值类型下面的值列表编码相同，请重新输入");
        }
        LookupValue lookupValue = new LookupValue();
        lookupValue.setExtendsValue1(lookupValueSave.getExtendsValue1());
        lookupValue.setExtendsValue2(lookupValueSave.getExtendsValue2());
        lookupValue.setExtendsValue3(lookupValueSave.getExtendsValue3());
        lookupValue.setIsEnable(lookupValueSave.getIsEnable());
        lookupValue.setLookupTypeCode(lookupValueSave.getLookupTypeCode());
        lookupValue.setLookupValueCode(lookupValueSave.getLookupValueCode());
        lookupValue.setLookupValueName(lookupValueSave.getLookupValueName());
        baseMapper.insert(lookupValue);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon updateLookupValue(LookupValueUpdate lookupValueUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<LookupValue>().eq("lookup_type_code",lookupValueUpdate.getLookupTypeCode()).eq("lookup_value_code",lookupValueUpdate.getLookupValueCode()).ne("lookup_value_id",lookupValueUpdate.getLookupValueId()));
        if(count>0){
            return ResultCommon.error("该值类型下面的值列表编码相同，请重新输入");
        }
        LookupValue lookupValue = new LookupValue();
        lookupValue.setLookupValueId(lookupValueUpdate.getLookupValueId());
        lookupValue.setExtendsValue1(lookupValueUpdate.getExtendsValue1());
        lookupValue.setExtendsValue2(lookupValueUpdate.getExtendsValue2());
        lookupValue.setExtendsValue3(lookupValueUpdate.getExtendsValue3());
        lookupValue.setIsEnable(lookupValueUpdate.getIsEnable());
        lookupValue.setLookupTypeCode(lookupValueUpdate.getLookupTypeCode());
        lookupValue.setLookupValueCode(lookupValueUpdate.getLookupValueCode());
        lookupValue.setLookupValueName(lookupValueUpdate.getLookupValueName());
        lookupValue.setUpdateTime(new Date());
        lookupValue.setModifier("system");
        baseMapper.updateById(lookupValue);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon deleteLookupValue(String lookupValueId) {
        baseMapper.deleteById(lookupValueId);
        return ResultCommon.ok();
    }
}
