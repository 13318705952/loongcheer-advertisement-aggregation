package com.loongcheer.advertisement.admanagement.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.loongcheer.advertisement.admanagement.service.AdPlatformService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformSave;
import com.loongcheer.advertisement.api.form.update.AdPlatformUpdate;
import com.loongcheer.advertisement.api.query.AdPlatformQuery;
import com.loongcheer.advertisement.api.vo.AdPlatformVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@RestController
@RequestMapping("/adPlatform")
@Api("广告信息")
public class AdPlatformController {
    private static Logger log = Logger.getLogger(AdPlatformController.class.getName());

    @Resource
    private AdPlatformService adPlatformService;

    /**
     * 查询广告平台信息
     * @param adPlatformQuery
     * @return
     */
    @ApiOperation("查询广告平台信息")
    @GetMapping("/queryAdPlatform")
    public ResultCommon queryAdPlatform(AdPlatformQuery adPlatformQuery){
        ResultCommon result = new ResultCommon();
        IPage<AdPlatformVo> list =  adPlatformService.queryAdPlatform(adPlatformQuery);
        return ResultCommon.ok(list);
    }

    /**
     * 新增广告平台信息
     * @param adPlatformSave
     * @return
     */
    @ApiOperation("新增广告平台信息")
    @PostMapping("/addAdPlatform")
    public ResultCommon addAdPlatform(@Validated AdPlatformSave adPlatformSave){
        return adPlatformService.addAdPlatform(adPlatformSave);
    }

    /**
     * 更新广告平台信息
     * @param adPlatformUpdate
     * @return
     */
    @ApiOperation("更新广告平台信息")
    @PostMapping("/updateAdPlatform")
    public ResultCommon updateAdPlatform(@Validated AdPlatformUpdate adPlatformUpdate){
        return adPlatformService.updateAdPlatform(adPlatformUpdate);
    }

    /**
     * 删除广告平台信息
     * @param advPlatformId
     * @return
     */
    @ApiOperation("删除广告平台信息")
    @DeleteMapping("/deleteAdPlatform")
    public ResultCommon deleteAdPlatform(@RequestParam(value="advPlatformId",required=true) String advPlatformId){
        return adPlatformService.deleteAdPlatform(advPlatformId);
    }
}
