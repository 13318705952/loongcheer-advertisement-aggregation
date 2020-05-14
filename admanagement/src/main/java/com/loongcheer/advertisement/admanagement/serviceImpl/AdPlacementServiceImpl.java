package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlacementMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlacementService;
import com.loongcheer.advertisement.api.entity.AdPlacement;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlacementSave;
import com.loongcheer.advertisement.api.form.update.AdPlacementUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@Service
public class AdPlacementServiceImpl extends ServiceImpl<AdPlacementMapper, AdPlacement> implements AdPlacementService {


    @Override
    public ResultCommon queryAdPlacement() {
        return null;
    }

    /**
     * 新增广告位信息
     * @param adPlacementSave
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlacement(AdPlacementSave adPlacementSave) {
        int count = baseMapper.selectCount(new QueryWrapper<AdPlacement>().eq("app_id",adPlacementSave.getAppId()).eq("adv_placement_name",adPlacementSave.getAdvPlacementName()));
        if(count>0){
            return ResultCommon.error("广告位名称重复，请重新输入");
        }
        AdPlacement adPlacement = new AdPlacement();
        adPlacement.setAdvPlacementName(adPlacementSave.getAdvPlacementName());
        adPlacement.setAdvTypeId(adPlacementSave.getAdvTypeId());
        adPlacement.setAppId(adPlacementSave.getAppId());
        adPlacement.setAppKey(adPlacementSave.getAppKey());
        adPlacement.setRemake(adPlacementSave.getRemake());
        adPlacement.setIsEnable(adPlacementSave.getIsEnable());
        baseMapper.insert(adPlacement);
        return ResultCommon.ok();
    }

    /**
     * 更新广告位信息
     * @param adPlacementUpdate
     * @return
     */
    @Override
    @Transactional
    public ResultCommon updateAdPlacement(AdPlacementUpdate adPlacementUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<AdPlacement>().eq("app_id",adPlacementUpdate.getAppId()).eq("adv_placement_name",adPlacementUpdate.getAdvPlacementName()).ne("adv_placement_id",adPlacementUpdate.getAdvPlacementId()));
        if(count>0){
            return ResultCommon.error("广告位名称重复，请重新输入");
        }
        AdPlacement adPlacement = new AdPlacement();
        adPlacement.setAdvPlacementId(adPlacementUpdate.getAdvPlacementId());
        adPlacement.setAdvPlacementName(adPlacementUpdate.getAdvPlacementName());
        adPlacement.setAdvTypeId(adPlacementUpdate.getAdvTypeId());
        adPlacement.setAppId(adPlacementUpdate.getAppId());
        adPlacement.setAppKey(adPlacementUpdate.getAppKey());
        adPlacement.setRemake(adPlacementUpdate.getRemake());
        adPlacement.setIsEnable(adPlacementUpdate.getIsEnable());
        baseMapper.updateById(adPlacement);
        return ResultCommon.ok();
    }

    /**
     * 删除广告位信息
     * @param AdPlacementId
     * @return
     */
    @Override
    @Transactional
    public ResultCommon deleteAdPlacement(String AdPlacementId) {
        baseMapper.deleteById(AdPlacementId);
        return ResultCommon.ok();
    }


}
