package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlatformMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlatformService;
import com.loongcheer.advertisement.api.entity.AdPlatform;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.entity.User;
import com.loongcheer.advertisement.api.form.save.AdPlatformSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformUpdate;
import com.loongcheer.advertisement.api.query.AdPlatformQuery;
import com.loongcheer.advertisement.api.vo.AdPlatformVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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

    /**
     * 分页查询广告平台信息
     * @param adPlatformQuery
     * @return
     */
    @Override
    public List<AdPlatformVo> queryAdPlatform(AdPlatformQuery adPlatformQuery,User user) {
//        Page<AdPlatformVo> page = new Page<>(adPlatformQuery.getPage(),adPlatformQuery.getPageSize());
//        page.setRecords(adPlatformMapper.queryAdPlatform(page,adPlatformQuery));

        return baseMapper.queryAdPlatform(adPlatformQuery,user.getUserName());
    }

    /**
     * 新增广告平台信息
     * @param adPlatformSave
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlatform(AdPlatformSave adPlatformSave, User user) {
        AdPlatform adPlatform = new AdPlatform();
        //如果未开通报表API，则直接把扩展属性的字符串加入
        if(adPlatformSave.getIsReportApi()==0){
            adPlatform.setExtendParams(adPlatformSave.getExtendParams());
            adPlatform.setCreator(user.getUserName());
            adPlatform.setAdvPlatformCode(adPlatformSave.getAdvPlatformCode());
            adPlatform.setAdvPlatformName(adPlatformSave.getAdvPlatformName());
            adPlatform.setIsReportApi(adPlatformSave.getIsReportApi());
            //如果要添加平台应用的时候
            if(StringUtils.isNotBlank(adPlatformSave.getPlatformAppId())){
                //查询该用户下，该平台的平台应用有没有重复添加
                int count = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("adv_platform_code",adPlatformSave.getAdvPlatformCode()).eq("platform_app_id",adPlatformSave.getPlatformAppId()).eq("creator",user.getUserName()));
                if(count>0){
                    return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
                }
                adPlatform.setPlatformAppId(adPlatformSave.getPlatformAppId());
            }
            baseMapper.insert(adPlatform);
        }else{
            //如果要开通报表API，需要把扩张属性对应的值进行对应平台的校验
        }

        return ResultCommon.ok();
    }

    /**
     * 修改广告平台
     * @param adPlatforUpdate
     * @return
     */
    @Override
    @Transactional
    public ResultCommon updateAdPlatform(AdPlatformUpdate adPlatforUpdate,User user) {
        AdPlatform adPlatform = new AdPlatform();
        //如果未开通报表API，则直接把扩展属性的字符串加入
        if(adPlatforUpdate.getIsReportApi()==0){
            adPlatform.setModifier(user.getUserName());
            adPlatform.setAdvPlatformCode(adPlatforUpdate.getAdvPlatformCode());
            adPlatform.setAdvPlatformName(adPlatforUpdate.getAdvPlatformName());
            adPlatform.setIsReportApi(adPlatforUpdate.getIsReportApi());
            adPlatform.setUpdateTime(new Date());
            if(StringUtils.isNotBlank(adPlatforUpdate.getPlatformAppId())){
                //查询该用户下，该平台的平台应用有没有重复添加
                int count = baseMapper.selectCount(new QueryWrapper<AdPlatform>().eq("adv_platform_code",adPlatforUpdate.getAdvPlatformCode()).eq("platform_app_id",adPlatforUpdate.getPlatformAppId()).eq("creator",user.getUserName()).ne("adv_platform_id",adPlatforUpdate.getAdvPlatformId()));
                if(count>0){
                    return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
                }
                adPlatform.setPlatformAppId(adPlatforUpdate.getPlatformAppId());
                baseMapper.updateById(adPlatform);
            }
        }else{
            //如果要开通报表API，需要把扩张属性对应的值进行对应平台的校验
        }
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
