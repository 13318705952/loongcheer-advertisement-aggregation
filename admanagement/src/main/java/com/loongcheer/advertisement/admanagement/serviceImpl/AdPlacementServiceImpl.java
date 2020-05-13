package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlacementMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlacementService;
import com.loongcheer.advertisement.api.entity.AdPlacement;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatforSave;
import com.loongcheer.advertisement.api.form.update.AdPlatforUpdate;
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

    @Override
    public ResultCommon addAdPlacement(AdPlatforSave adPlatforSave) {
        return null;
    }

    @Override
    public ResultCommon updateAdPlacement(AdPlatforUpdate adPlatforUpdate) {
        return null;
    }

    @Override
    public ResultCommon deleteAdPlacement(String AdPlatforId) {
        return null;
    }
}
