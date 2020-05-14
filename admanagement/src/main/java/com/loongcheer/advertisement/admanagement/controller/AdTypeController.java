package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.AdTypeService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdTypeSave;
import com.loongcheer.advertisement.api.form.update.AdTypeUpdate;
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
@RequestMapping("/adType")
@Api("广告类型")
public class AdTypeController {

    @Resource
    private AdTypeService adTypeService;

    @GetMapping("/queryAdType")
    @ApiOperation("查询广告类型")
    public ResultCommon queryAdType(){
        return null;
    }

    @PostMapping("/addAdType")
    @ApiOperation("新增广告类型")
    public ResultCommon addAdType(@Validated AdTypeSave adTypeSave){
        return adTypeService.addAdType(adTypeSave);
    }

    @PostMapping("/updateAdType")
    @ApiOperation("更新广告类型")
    public ResultCommon updateAdType(@Validated AdTypeUpdate adTypeUpdate){
        return adTypeService.updateAdType(adTypeUpdate);
    }

    @DeleteMapping("/deleteAdType")
    @ApiOperation("删除广告类型")
    public ResultCommon deleteAdType(@RequestParam(value = "adTypeId" ,required = true) String adTypeId){
        return adTypeService.deleteAdType(adTypeId);
    }
}
