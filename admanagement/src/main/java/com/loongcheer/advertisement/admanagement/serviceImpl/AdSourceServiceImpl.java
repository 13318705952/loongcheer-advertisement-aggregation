package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdSourceMapper;
import com.loongcheer.advertisement.admanagement.service.AdSourceService;
import com.loongcheer.advertisement.api.entity.AdSource;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdSourceSave;
import com.loongcheer.advertisement.api.form.update.AdSourceUpdate;
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
public class AdSourceServiceImpl extends ServiceImpl<AdSourceMapper, AdSource> implements AdSourceService {

    @Override
    public ResultCommon queryAdSource() {
        return null;
    }

    @Override
    @Transactional
    public ResultCommon addAdSource(AdSourceSave adSourceSave) {
        AdSource adSource = new AdSource();
        adSource.setAppId(adSourceSave.getAppId());
        adSource.setEcmp(adSourceSave.getEcmp());
        adSource.setGameId(adSourceSave.getGameId());
        adSource.setFlowGroupId(adSourceSave.getFlowGroupId());
        adSource.setPlacementId(adSourceSave.getPlacementId());
        adSource.setPlatformName(adSourceSave.getPlatformName());
        adSource.setIsOpen(adSourceSave.getIsOpen());
        adSource.setIsEnable(adSourceSave.getIsEnable());
        adSource.setRemake(adSourceSave.getRemake());
        adSource.setSourceName(adSourceSave.getSourceName());
        baseMapper.insert(adSource);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon updateAdSource(AdSourceUpdate adSourceUpdate) {
        AdSource adSource = new AdSource();
        adSource.setAppId(adSourceUpdate.getAppId());
        adSource.setEcmp(adSourceUpdate.getEcmp());
        adSource.setGameId(adSourceUpdate.getGameId());
        adSource.setFlowGroupId(adSourceUpdate.getFlowGroupId());
        adSource.setPlacementId(adSourceUpdate.getPlacementId());
        adSource.setPlatformName(adSourceUpdate.getPlatformName());
        adSource.setIsOpen(adSourceUpdate.getIsOpen());
        adSource.setIsEnable(adSourceUpdate.getIsEnable());
        adSource.setRemake(adSourceUpdate.getRemake());
        adSource.setSourceName(adSourceUpdate.getSourceName());
        adSource.setUpdateTime(new Date());
        adSource.setModifier("system");
        baseMapper.updateById(adSource);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon deleteAdSource(String adSourceId) {
        baseMapper.deleteById(adSourceId);
        return ResultCommon.ok();
    }
}
