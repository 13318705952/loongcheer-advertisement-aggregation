package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.PlatformApplicationMapper;
import com.loongcheer.advertisement.admanagement.service.PlatformApplicationService;
import com.loongcheer.advertisement.api.entity.PlatformApplication;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformAppSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformAppUpdate;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@Service
public class PlatformApplicationServiceImpl extends ServiceImpl<PlatformApplicationMapper, PlatformApplication> implements PlatformApplicationService {


    @Override
    public ResultCommon queryPlatformApp(AdPlatformAppSave adPlatformAppSave) {
        return null;
    }

    @Override
    public ResultCommon addAdPlatformApp(AdPlatformAppSave adPlatformAppSave) {
        return null;
    }

    @Override
    public ResultCommon updateAdPlatformApp(AdPlatformAppUpdate adPlatformAppUpdate) {
        return null;
    }

    @Override
    public ResultCommon deleteAdPlatformApp(String advPlatformAppId) {
        return null;
    }
}
