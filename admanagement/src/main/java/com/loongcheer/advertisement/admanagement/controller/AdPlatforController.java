package com.loongcheer.advertisement.admanagement.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.loongcheer.advertisement.admanagement.service.AdPlatforService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatforSave;
import com.loongcheer.advertisement.api.form.update.AdPlatforUpdate;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;
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
@RequestMapping("/adPlatfor")
@Api("广告信息")
public class AdPlatforController {
    private static Logger log = Logger.getLogger(AdPlatforController.class.getName());

    @Resource
    private AdPlatforService adPlRCatforService;

    /**
     * 查询广告平台信息
     * @param adPlatforQuery
     * @return
     */
    @ApiOperation("查询广告平台信息")
    @GetMapping("/queryAdPlatfor")
    public ResultCommon queryAdPlatfor(AdPlatforQuery adPlatforQuery){
        ResultCommon result = new ResultCommon();
        IPage<AdPlatforVo> list =  adPlRCatforService.queryAdPlatfor(adPlatforQuery);
        throw new NullPointerException("111");
        //return ResultCommon.ok(list);
    }

    /**
     * 新增广告平台信息
     * @param adPlatforSave
     * @return
     */
    @ApiOperation("新增广告平台信息")
    @PostMapping("/addAdPlatfor")
    public ResultCommon addAdPlatfor(@Validated AdPlatforSave adPlatforSave){
        return adPlRCatforService.addAdPlatfor(adPlatforSave);
    }

    /**
     * 更新广告平台信息
     * @param adPlatforUpdate
     * @return
     */
    @ApiOperation("更新广告平台信息")
    @PostMapping("/updateAdPlatfor")
    public ResultCommon updateAdPlatfor(@Validated AdPlatforUpdate adPlatforUpdate){
        return adPlRCatforService.updateAdPlatfor(adPlatforUpdate);
    }

    /**
     * 删除广告平台信息
     * @param advPlatforId
     * @return
     */
    @ApiOperation("删除广告平台信息")
    @DeleteMapping("/deleteAdPlatfor")
    public ResultCommon deleteAdPlatfor(@RequestParam(value="advPlatforId",required=true) String advPlatforId){
        return adPlRCatforService.deleteAdPlatfor(advPlatforId);
    }
}
