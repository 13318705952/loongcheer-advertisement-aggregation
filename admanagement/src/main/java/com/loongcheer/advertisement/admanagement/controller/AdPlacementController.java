package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.AdPlacementService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlacementSave;
import com.loongcheer.advertisement.api.form.update.AdPlacementUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@RestController
@RequestMapping("/adPlacement")
@Api(value = "广告位信息管理")
public class AdPlacementController {

    @Resource
    private AdPlacementService adPlacementService;

    @GetMapping("/queryAdPlacement")
    @ApiOperation("查询广告位信息")
    public ResultCommon queryAdPlacement(){
        return null;
    }

    @PostMapping("/addAdPlacement")
    @ApiOperation("新增广告位信息")
    public ResultCommon addAdPlacement(@Validated AdPlacementSave adPlacement){
        return adPlacementService.addAdPlacement(adPlacement);
    }

    @PostMapping("/updateAdPlacement")
    @ApiOperation("更新广告位信息")
    public ResultCommon updateAdPlacement(@Validated AdPlacementUpdate adPlacementUpdate){
        return adPlacementService.updateAdPlacement(adPlacementUpdate);
    }

    @DeleteMapping("/deleteAdPlacement")
    @ApiOperation("删除广告位信息")
    public ResultCommon deleteAdPlacement(@RequestParam(value="AdPlacementId",required=true) String AdPlacementId){
        return adPlacementService.deleteAdPlacement(AdPlacementId);
    }
}
