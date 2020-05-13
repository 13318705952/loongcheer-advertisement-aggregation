package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.AdPlatfor;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatforSave;
import com.loongcheer.advertisement.api.form.update.AdPlatforUpdate;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdPlatforService extends IService<AdPlatfor> {
    /**
     * 分页查询广告平台
     * @param adPlatforQuery
     * @return
     */
    IPage<AdPlatforVo> queryAdPlatfor(AdPlatforQuery adPlatforQuery);

    /**
     * 新增广告平台信息
     * @param adPlatforSave
     * @return
     */
    ResultCommon addAdPlatfor(AdPlatforSave adPlatforSave);

    /**
     * 更新广告平台信息
     * @param adPlatforUpdate
     * @return
     */
    ResultCommon updateAdPlatfor(AdPlatforUpdate adPlatforUpdate);

    /**
     * 删除广告平台信息
     * @param advPlatforId
     * @return
     */
    ResultCommon deleteAdPlatfor(String advPlatforId);

}
