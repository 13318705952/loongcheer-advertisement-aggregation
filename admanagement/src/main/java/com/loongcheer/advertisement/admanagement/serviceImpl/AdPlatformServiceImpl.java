package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlatformMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlatformService;
import com.loongcheer.advertisement.api.entity.AdPlatform;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformUpdate;
import com.loongcheer.advertisement.api.query.AdPlatformQuery;
import com.loongcheer.advertisement.api.vo.AdPlatformVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
public class AdPlatformServiceImpl extends ServiceImpl<AdPlatformMapper, AdPlatform> implements AdPlatformService {

    @Resource
    private AdPlatformMapper adPlatformMapper;
    /**
     * 分页查询广告平台信息
     * @param adPlatformQuery
     * @return
     */
    @Override
    public IPage<AdPlatformVo> queryAdPlatform(AdPlatformQuery adPlatformQuery) {
        Page<AdPlatformVo> page = new Page<>(adPlatformQuery.getPage(),adPlatformQuery.getPageSize());
        page.setRecords(adPlatformMapper.queryAdPlatform(page,adPlatformQuery));
        return page;
    }

    /**
     * 新增广告平台信息
     * @param adPlatformSave
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlatform(AdPlatformSave adPlatformSave) {
        //单单只新增广告平台，不添加应用

        if(StringUtils.isBlank(adPlatformSave.getPlatformAppId())){
            int count = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("adv_platform_name", adPlatformSave.getAdvPlatformName()));
            if(count>0){
                return ResultCommon.error("广告名称已经被使用，请修改广告名称");
            }
        }else{
            //新增了广告平台和应用
            int count2 = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("adv_platform_name",adPlatformSave.getAdvPlatformName()).eq("platform_app_id",adPlatformSave.getPlatformAppId()));
            if(count2>0){
                return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
            }
        }
        AdPlatform adPlatform = new AdPlatform();
        adPlatform.setAdvPlatformName(adPlatformSave.getAdvPlatformName());
        adPlatform.setPlatformAppId(adPlatformSave.getPlatformAppId());
        baseMapper.insert(adPlatform);
        return ResultCommon.ok();
    }

    /**
     * 修改广告平台
     * @param adPlatforUpdate
     * @return
     */
    @Override
    @Transactional
    public ResultCommon updateAdPlatform(AdPlatformUpdate adPlatforUpdate) {
        //如果没有平台应用信息的情况下
        if(StringUtils.isBlank(adPlatforUpdate.getPlatformAppId())){
            int count = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("adv_platfor_name",adPlatforUpdate.getAdvPlatformName()).ne("adv_platfor_id",adPlatforUpdate.getAdvPlatformId()));
            if(count>0){
                return ResultCommon.error("广告名称已经被使用，请修改广告名称");
            }
        }else{
            //当添加有平台应用信息的情况下
            int count2 = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("platfor_app_id",adPlatforUpdate.getPlatformAppId()).eq("adv_platfor_name",adPlatforUpdate.getAdvPlatformName()).ne("adv_platfor_id",adPlatforUpdate.getAdvPlatformId()));
            if(count2>0){
                return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
            }
        }
        AdPlatform adPlatform = new AdPlatform();
        adPlatform.setPlatformAppId(adPlatforUpdate.getPlatformAppId());
        adPlatform.setAdvPlatformId(adPlatforUpdate.getAdvPlatformId());
        adPlatform.setAdvPlatformName(adPlatforUpdate.getAdvPlatformName());
        adPlatform.setUpdateTime(new Date());
        adPlatform.setModifier("system");
        baseMapper.updateById(adPlatform);
        return ResultCommon.ok();
    }

    /**
     * 删除广告平台
     * @param advPlatformId
     * @return
     */
    @Override
    @Transactional
    public ResultCommon deleteAdPlatform(String advPlatformId) {
        baseMapper.deleteById(advPlatformId);
        return ResultCommon.ok();
    }

}
