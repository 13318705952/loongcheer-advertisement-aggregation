package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.AdPlatform;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformUpdate;
import com.loongcheer.advertisement.api.query.AdPlatformQuery;
import com.loongcheer.advertisement.api.vo.AdPlatformVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdPlatformService extends IService<AdPlatform> {
    /**
     * 分页查询广告平台
     * @param adPlatformQuery
     * @return
     */
    IPage<AdPlatformVo> queryAdPlatform(AdPlatformQuery adPlatformQuery);

    /**
     * 新增广告平台信息
     * @param adPlatformSave
     * @return
     */
    ResultCommon addAdPlatform(AdPlatformSave adPlatformSave);

    /**
     * 更新广告平台信息
     * @param adPlatformUpdate
     * @return
     */
    ResultCommon updateAdPlatform(AdPlatformUpdate adPlatformUpdate);

    /**
     * 删除广告平台信息
     * @param advPlatformId
     * @return
     */
    ResultCommon deleteAdPlatform(String advPlatformId);

}
