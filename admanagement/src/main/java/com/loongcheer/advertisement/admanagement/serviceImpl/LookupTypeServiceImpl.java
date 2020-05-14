package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.LookupTypeMapper;
import com.loongcheer.advertisement.admanagement.service.LookupTypeService;
import com.loongcheer.advertisement.api.entity.LookupType;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupTypeSave;
import com.loongcheer.advertisement.api.form.update.LookupTypeUpdate;
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
public class LookupTypeServiceImpl extends ServiceImpl<LookupTypeMapper, LookupType> implements LookupTypeService {

    @Override
    public ResultCommon queryLookupType() {
        return null;
    }

    @Transactional
    @Override
    public ResultCommon addLookupType(LookupTypeSave lookupTypeSave) {
        int count = baseMapper.selectCount(new QueryWrapper<LookupType>().eq("lookup_type_code",lookupTypeSave.getLookupTypeCode()));
        if(count>0){
            return ResultCommon.error("值类型编码重复");
        }
        LookupType lookupType = new LookupType();
        lookupType.setRemake(lookupTypeSave.getRemark());
        lookupType.setLookupTypeCode(lookupTypeSave.getLookupTypeCode());
        lookupType.setLookupTypeName(lookupTypeSave.getLookupTypeName());
        baseMapper.insert(lookupType);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon updateLookupType(LookupTypeUpdate lookupTypeUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<LookupType>().eq("lookup_type_code",lookupTypeUpdate.getLookupTypeCode()).ne("lookup_type_id",lookupTypeUpdate.getLookupTypeId()));
        if(count>0){
            return ResultCommon.error("值类型编码重复");
        }
        LookupType lookupType = new LookupType();
        lookupType.setRemake(lookupTypeUpdate.getRemark());
        lookupType.setLookupTypeCode(lookupTypeUpdate.getLookupTypeCode());
        lookupType.setLookupTypeName(lookupTypeUpdate.getLookupTypeName());
        lookupType.setUpdateTime(new Date());
        lookupType.setModifier("system");
        baseMapper.updateById(lookupType);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon deleteLookupType(String lookupTypeId) {
        baseMapper.deleteById(lookupTypeId);
        return ResultCommon.ok();
    }
}
