package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.AdType;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdTypeSave;
import com.loongcheer.advertisement.api.form.update.AdTypeUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdTypeService extends IService<AdType> {
    /**
     * 查询广告类型
     * @return
     */
    ResultCommon queryAdType();

    /**
     * 新增广告类型
     * @param adTypeSave
     * @return
     */
    ResultCommon addAdType(AdTypeSave adTypeSave);

    /**
     * 更新广告类型
     * @param adTypeUpdate
     * @return
     */
    ResultCommon updateAdType(AdTypeUpdate adTypeUpdate);

    /**
     * 删除广告类型
     * @param adTypeId
     * @return
     */
    ResultCommon deleteAdType(String adTypeId);
}
