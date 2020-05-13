package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.api.entity.ResultCommon;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/queryAdSource")
    @ApiOperation("查询广告源信息")
    public ResultCommon queryAdSource(){
        return null;
    }

    @PostMapping("/addAdSource")
    @ApiOperation("新增广告源信息")
    public ResultCommon addAdSource(){
        return null;
    }

    @PostMapping("/updateAdSource")
    @ApiOperation("更新广告源信息")
    public ResultCommon updateAdSource(){
        return null;
    }

    @DeleteMapping("/deleteAdSource")
    @ApiOperation("删除广告源信息")
    public ResultCommon deleteAdSource(){
        return null;
    }
}
