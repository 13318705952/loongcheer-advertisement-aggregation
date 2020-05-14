package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.AdSourceService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdSourceSave;
import com.loongcheer.advertisement.api.form.update.AdSourceUpdate;
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
@RequestMapping("/adSource")
@Api("广告源")
public class AdSourceController {

    @Resource
    private AdSourceService adSourceService;

    @GetMapping("/queryAdSource")
    @ApiOperation("查询广告源信息")
    public ResultCommon queryAdSource(){
        return null;
    }

    @PostMapping("/addAdSource")
    @ApiOperation("新增广告源信息")
    public ResultCommon addAdSource(@Validated AdSourceSave adSourceSave){
        return adSourceService.addAdSource(adSourceSave);
    }

    @PostMapping("/updateAdSource")
    @ApiOperation("更新广告源信息")
    public ResultCommon updateAdSource(@Validated AdSourceUpdate adSourceUpdate){
        return adSourceService.updateAdSource(adSourceUpdate);
    }

    @DeleteMapping("/deleteAdSource")
    @ApiOperation("删除广告源信息")
    public ResultCommon deleteAdSource(@RequestParam(value = "adSourceId" ,required = true) String adSourceId){
        return adSourceService.deleteAdSource(adSourceId);
    }
}
