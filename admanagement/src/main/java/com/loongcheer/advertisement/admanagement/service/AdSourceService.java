package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.AdSource;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdSourceSave;
import com.loongcheer.advertisement.api.form.update.AdSourceUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdSourceService extends IService<AdSource> {
    /**
     * 查询广告源信息
     * @return
     */
    ResultCommon queryAdSource();

    /**
     * 新增广告源信息
     * @param adSourceSave
     * @return
     */
    ResultCommon addAdSource(AdSourceSave adSourceSave);

    /**
     * 更新广告源信息
     * @param adSourceUpdate
     * @return
     */
    ResultCommon updateAdSource(AdSourceUpdate adSourceUpdate);

    /**
     * 删除广告源信息
     * @param adSourceId
     * @return
     */
    ResultCommon deleteAdSource(String adSourceId);
}
