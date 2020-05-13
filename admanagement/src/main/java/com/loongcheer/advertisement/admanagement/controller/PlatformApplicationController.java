package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.PlatformApplicationService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlatformAppSave;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/platformApplication")
@Api("平台应用")
public class PlatformApplicationController {

    @Resource
    PlatformApplicationService platformApplicationService;

    @GetMapping("/queryPlatformApplication")
    @ApiOperation("查询平台应用")
    public ResultCommon queryPlatformApplication(){ return null;
    }

    @PostMapping("/addPlatformApplication")
    @ApiOperation("新增平台应用")
    public ResultCommon addPlatformApplication(AdPlatformAppSave){

        return null;
    }

    @PostMapping("/updatePlatformApplication")
    @ApiOperation("更新平台应用")
    public ResultCommon updatePlatformApplication(){
        return null;
    }

    @DeleteMapping("/deletePlatformApplication")
    @ApiOperation("删除平台应用")
    public ResultCommon deletePlatformApplication(){
        return null;
    }
}
