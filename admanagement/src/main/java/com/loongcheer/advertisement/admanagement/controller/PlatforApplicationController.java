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
@RequestMapping("/platforApplication")
@Api("平台应用")
public class PlatforApplicationController {
    @GetMapping("/queryPlatforApplication")
    @ApiOperation("查询平台应用")
    public ResultCommon queryPlatforApplication(){
        return null;
    }

    @PostMapping("/addPlatforApplication")
    @ApiOperation("新增平台应用")
    public ResultCommon addPlatforApplication(){
        return null;
    }

    @PostMapping("/updatePlatforApplication")
    @ApiOperation("更新平台应用")
    public ResultCommon updatePlatforApplication(){
        return null;
    }

    @DeleteMapping("/deletePlatforApplication")
    @ApiOperation("删除平台应用")
    public ResultCommon deletePlatforApplication(){
        return null;
    }
}
