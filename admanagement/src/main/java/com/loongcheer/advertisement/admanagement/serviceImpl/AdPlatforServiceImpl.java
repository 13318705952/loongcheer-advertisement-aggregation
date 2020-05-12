package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.AdPlatforMapper;
import com.loongcheer.advertisement.admanagement.service.AdPlatforService;
import com.loongcheer.advertisement.api.entity.AdPlatfor;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

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

    private static Logger log = Logger.getLogger(AdPlatforServiceImpl.class.getName());

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
        try{
            page.setRecords(adPlatforMapper.queryAdPlatfor(page,adPlatforQuery));
        }catch (Exception e){
            log.info(e.getMessage());
        }
        return page;
    }

    /**
     * 新增广告平台信息
     * @param adPlatfor
     * @return
     */
    @Override
    @Transactional
    public ResultCommon addAdPlatfor(AdPlatfor adPlatfor) {
        if(StringUtils.isBlank(adPlatfor.getAdvPlatforName())){
            return ResultCommon.error("广告平台名称不能为空");
        }
        if(StringUtils.isBlank(adPlatfor.getPlatforAppId())){
            return ResultCommon.error("广告平台应用不能为空");
        }
        baseMapper.insert(adPlatfor);
        return ResultCommon.ok();
    }

    /**
     * 修改广告平台
     * @param adPlatfor
     * @return
     */
    @Override
    @Transactional
    public ResultCommon updateAdPlatfor(AdPlatfor adPlatfor) {
        if(StringUtils.isBlank(adPlatfor.getAdvPlatforId())){
            return ResultCommon.error("广告平台id不能为空");
        }
        int count = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("adv_platfor_name",adPlatfor.getAdvPlatforName()).ne("adv_platfor_id",adPlatfor.getAdvPlatforId()));
        if(count>0){
            return ResultCommon.error("广告名称已经被使用，请修改广告名称");
        }
        int count2 = baseMapper.selectCount(new QueryWrapper<AdPlatfor>().eq("platfor_app_id",adPlatfor.getAdvPlatforName()).ne("adv_platfor_id",adPlatfor.getAdvPlatforId()));
        if(count2>0){
            return ResultCommon.error("该平台下的应用已经被添加过，请重新选择");
        }
        adPlatfor.setUpdateTime(new Date());
        adPlatfor.setModifier("system");
        baseMapper.updateById(adPlatfor);
        return ResultCommon.ok();
    }

    /**
     * 删除广告平台
     * @param adPlatfor
     * @return
     */
    @Override
    public ResultCommon deleteAdPlatfor(AdPlatfor adPlatfor) {
        if(StringUtils.isBlank(adPlatfor.getAdvPlatforId())){
            return ResultCommon.error("广告平台id不能为空");
        }
        baseMapper.deleteById(adPlatfor.getAdvPlatforId());
        return ResultCommon.ok();
    }

}
