package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdTypeMapper;
import com.loongcheer.advertisement.admanagement.service.AdTypeService;
import com.loongcheer.advertisement.api.entity.AdType;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdTypeSave;
import com.loongcheer.advertisement.api.form.update.AdTypeUpdate;
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
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements AdTypeService {

    @Override
    public ResultCommon queryAdType() {
        return null;
    }

    @Override
    @Transactional
    public ResultCommon addAdType(AdTypeSave adTypeSave) {
        int count = baseMapper.selectCount(new QueryWrapper<AdType>().eq("adv_plaffor_id",adTypeSave.getAdvPlafforId()).eq("adv_type",adTypeSave.getAdvType()));
        if(count>0){
            return ResultCommon.error("该平台下的广告类型已经存在，请重新选择");
        }
        AdType adType = new AdType();
        adType.setAdvType(adTypeSave.getAdvType());
        adType.setAdvPlatformId(adTypeSave.getAdvPlafforId());
        adType.setAdvTypeName(adTypeSave.getAdvTypeName());
        adType.setRemake(adTypeSave.getRemake());
        baseMapper.insert(adType);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon updateAdType(AdTypeUpdate adTypeUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<AdType>().eq("adv_plaffor_id",adTypeUpdate.getAdvPlafforId()).eq("adv_type",adTypeUpdate.getAdvType()).ne("adv_type_id",adTypeUpdate.getAdvTypeId()));
        if(count>0){
            return ResultCommon.error("该平台下的广告类型已经存在，请重新选择");
        }
        AdType adType = new AdType();
        adType.setAdvTypeName(adTypeUpdate.getAdvTypeName());
        adType.setAdvType(adTypeUpdate.getAdvType());
        adType.setAdvPlatformId(adTypeUpdate.getAdvPlafforId());
        adType.setAdvTypeId(adTypeUpdate.getAdvTypeId());
        adType.setRemake(adTypeUpdate.getRemake());
        adType.setUpdateTime(new Date());
        adType.setModifier("system");
        adType.setIsEnable(adTypeUpdate.getIsEnable());
        baseMapper.updateById(adType);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon deleteAdType(String adTypeId) {
        baseMapper.deleteById(adTypeId);
        return ResultCommon.ok();
    }
}
