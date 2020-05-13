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
@RequestMapping("/adType")
@Api("广告类型")
public class AdTypeController {

    @GetMapping("/queryAdType")
    @ApiOperation("查询广告类型")
    public ResultCommon queryAdType(){
        return null;
    }

    @PostMapping("/addAdType")
    @ApiOperation("新增广告类型")
    public ResultCommon addAdType(){
        return null;
    }

    @PostMapping("/updateAdType")
    @ApiOperation("更新广告类型")
    public ResultCommon updateAdType(){
        return null;
    }

    @DeleteMapping("/deleteAdType")
    @ApiOperation("删除广告类型")
    public ResultCommon deleteAdType(){
        return null;
    }
}
