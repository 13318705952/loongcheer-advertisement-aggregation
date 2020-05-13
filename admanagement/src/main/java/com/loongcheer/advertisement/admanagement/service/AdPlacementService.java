package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.AdPlacement;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatforSave;
import com.loongcheer.advertisement.api.form.update.AdPlatforUpdate;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdPlacementService extends IService<AdPlacement> {
    /**
     * 查询广告位信息
     * @return
     */
    ResultCommon queryAdPlacement();

    /**
     * 新增广告位信息
     * @return
     */
    ResultCommon addAdPlacement(AdPlatforSave adPlatforSave);

    /**
     * 更新广告位信息
     * @return
     */
    ResultCommon updateAdPlacement(AdPlatforUpdate adPlatforUpdate);

    /**
     * 删除广告位信息
     * @return
     */
    ResultCommon deleteAdPlacement(String AdPlatforId);
}
