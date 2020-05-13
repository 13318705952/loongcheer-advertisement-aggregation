package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlatforMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlatforService;
import com.loongcheer.advertisement.api.entity.AdPlatfor;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatforSave;
import com.loongcheer.advertisement.api.form.update.AdPlatforUpdate;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;
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
public class AdPlatforServiceImpl extends ServiceImpl<AdPlatforMapper, AdPlatfor> implements AdPlatforService {

    @Resource
    private AdPlatforMapper adPlatforMapper;
    /**
     * 分页查询广告平台信息
     * @param adPlatforQuery
     * @return
     */
    @Override
    public IPage<AdPlatforVo> queryAdPlatfor(AdPlatforQuery adPlatforQuery) {
        Page<AdPlatforVo> page = new Page<>(adPlatforQuery.getPage(),adPlatforQuery.getPageSize());
        page.setRecords(adPlatforMapper.queryAdPlatfor(page,adPlatforQuery));
        return page;
    }

    /**
     * 新增广告平台信息
     * @param adPlatforSave
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlatfor(AdPlatforSave adPlatforSave) {
        //单单只新增广告平台，不添加应用

        if(StringUtils.isBlank(adPlatforSave.getPlatforAppId())){
            int count = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("adv_platfor_name", adPlatforSave.getAdvPlatforName()));
            if(count>0){
                return ResultCommon.error("广告名称已经被使用，请修改广告名称");
            }
        }else{
            //新增了广告平台和应用
            int count2 = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("adv_platfor_name",adPlatforSave.getAdvPlatforName()).eq("platfor_app_id",adPlatforSave.getPlatforAppId()));
            if(count2>0){
                return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
            }
        }
        AdPlatfor adPlatfor = new AdPlatfor();
        adPlatfor.setAdvPlatforName(adPlatforSave.getAdvPlatforName());
        adPlatfor.setPlatforAppId(adPlatforSave.getPlatforAppId());
        baseMapper.insert(adPlatfor);
        return ResultCommon.ok();
    }

    /**
     * 修改广告平台
     * @param adPlatforUpdate
     * @return
     */
    @Override
    @Transactional
    public ResultCommon updateAdPlatfor(AdPlatforUpdate adPlatforUpdate) {
        //如果没有平台应用信息的情况下
        if(StringUtils.isBlank(adPlatforUpdate.getPlatforAppId())){
            int count = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("adv_platfor_name",adPlatforUpdate.getAdvPlatforName()).ne("adv_platfor_id",adPlatforUpdate.getAdvPlatforId()));
            if(count>0){
                return ResultCommon.error("广告名称已经被使用，请修改广告名称");
            }
        }else{
            //当添加有平台应用信息的情况下
            int count2 = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("platfor_app_id",adPlatforUpdate.getPlatforAppId()).eq("adv_platfor_name",adPlatforUpdate.getAdvPlatforName()).ne("adv_platfor_id",adPlatforUpdate.getAdvPlatforId()));
            if(count2>0){
                return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
            }
        }
        AdPlatfor adPlatfor = new AdPlatfor();
        adPlatfor.setPlatforAppId(adPlatforUpdate.getPlatforAppId());
        adPlatfor.setAdvPlatforId(adPlatforUpdate.getAdvPlatforId());
        adPlatfor.setAdvPlatforName(adPlatforUpdate.getAdvPlatforName());
        adPlatfor.setUpdateTime(new Date());
        adPlatfor.setModifier("system");
        baseMapper.updateById(adPlatfor);
        return ResultCommon.ok();
    }

    /**
     * 删除广告平台
     * @param advPlatforId
     * @return
     */
    @Override
    @Transactional
    public ResultCommon deleteAdPlatfor(String advPlatforId) {
        baseMapper.deleteById(advPlatforId);
        return ResultCommon.ok();
    }

}
