package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.PlatformApplication;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformAppSave;
import com.loongcheer.advertisement.api.form.save.AdPlatformSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformAppUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface PlatformApplicationService extends IService<PlatformApplication> {

    /**
     * 查询平台应用信息
     * @param adPlatformAppSave
     * @return
     */
    ResultCommon queryPlatformApp(AdPlatformAppSave adPlatformAppSave);

    /**
     * 新增平台应用信息
     * @param adPlatformAppSave
     * @return
     */
    ResultCommon addAdPlatformApp(AdPlatformAppSave adPlatformAppSave);

    /**
     * 更新平台应用信息
     * @param adPlatformAppUpdate
     * @return
     */
    ResultCommon updateAdPlatformApp(AdPlatformAppUpdate adPlatformAppUpdate);

    /**
     * 删除平台应用信息
     * @param advPlatformAppId
     * @return
     */
    ResultCommon deleteAdPlatformApp(String advPlatformAppId);




}
