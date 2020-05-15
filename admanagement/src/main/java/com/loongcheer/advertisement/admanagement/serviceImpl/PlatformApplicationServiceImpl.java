package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.PlatformApplicationMapper;
import com.loongcheer.advertisement.admanagement.service.PlatformApplicationService;
import com.loongcheer.advertisement.api.entity.PlatformApplication;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformAppSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformAppUpdate;
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
public class PlatformApplicationServiceImpl extends ServiceImpl<PlatformApplicationMapper, PlatformApplication> implements PlatformApplicationService {


    @Override
    public ResultCommon queryPlatformApp(AdPlatformAppSave adPlatformAppSave) {
        return null;
    }

    /**
     * 新增平台应用信息
     * @param adPlatformAppSave
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlatformApp(AdPlatformAppSave adPlatformAppSave) {
        int count = baseMapper.selectCount(new QueryWrapper<PlatformApplication>().eq("platfrom_app_name",adPlatformAppSave.getApplicationName()));
        if (count>0){
            return ResultCommon.error("平台应用重复，请重新输入");
        }
        PlatformApplication platformApplication = new PlatformApplication();
        platformApplication.setAppKey(adPlatformAppSave.getAppKey());
        platformApplication.setApplicationName(adPlatformAppSave.getApplicationName());
        platformApplication.setAppShop(adPlatformAppSave.getAppShop());
        platformApplication.setAppShopUrl(adPlatformAppSave.getAppShopUrl());
        platformApplication.setCategory(adPlatformAppSave.getCategory());
        platformApplication.setSubCategory(adPlatformAppSave.getSubCategory());
        platformApplication.setIconUrl(adPlatformAppSave.getIconUrl());
        platformApplication.setPackageName(adPlatformAppSave.getPackageName());
        platformApplication.setPlatformType(adPlatformAppSave.getPlatformType());
        platformApplication.setScreenOrientation(adPlatformAppSave.getScreenOrientation());
        platformApplication.setAppShop(adPlatformAppSave.getAppShop());
        baseMapper.insert(platformApplication);
        return ResultCommon.ok();
    }

    @Override
    public ResultCommon updateAdPlatformApp(AdPlatformAppUpdate adPlatformAppUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<PlatformApplication>().eq("application_name",adPlatformAppUpdate.getApplicationName()).ne("platfrom_app_id",adPlatformAppUpdate.getPlatformAppId()));
        if (count>0){
            return ResultCommon.error("平台应用名称重复，请重新输入");
        }
        PlatformApplication platformApplication = new PlatformApplication();
        platformApplication.setPlatformAppId(adPlatformAppUpdate.getPlatformAppId());
        platformApplication.setAppKey(adPlatformAppUpdate.getAppKey());
        platformApplication.setApplicationName(adPlatformAppUpdate.getApplicationName());
        platformApplication.setAppShop(adPlatformAppUpdate.getAppShop());
        platformApplication.setAppShopUrl(adPlatformAppUpdate.getAppShopUrl());
        platformApplication.setCategory(adPlatformAppUpdate.getCategory());
        platformApplication.setSubCategory(adPlatformAppUpdate.getSubCategory());
        platformApplication.setIconUrl(adPlatformAppUpdate.getIconUrl());
        platformApplication.setPackageName(adPlatformAppUpdate.getPackageName());
        platformApplication.setPlatformType(adPlatformAppUpdate.getPlatformType());
        platformApplication.setScreenOrientation(adPlatformAppUpdate.getScreenOrientation());
        platformApplication.setAppShop(adPlatformAppUpdate.getAppShop());
        baseMapper.updateById(platformApplication);
        return ResultCommon.ok();
    }

    @Override
    public ResultCommon deleteAdPlatformApp(String advPlatformAppId) {
        baseMapper.deleteById(advPlatformAppId);
        return ResultCommon.ok();
    }
}
