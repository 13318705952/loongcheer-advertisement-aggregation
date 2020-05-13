package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.api.entity.ResultCommon;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@RestController
@RequestMapping("/lookupType")
@Api("值类型")
public class LookupTypeController {

    @PostMapping("/addLookupType")
    @ApiOperation("新增值类型")
    public ResultCommon addLookupType(){
        return null;
    }

    @PostMapping("/updateLookupType")
    @ApiOperation("更新值类型")
    public ResultCommon updateLookupType(){
        return null;
    }

    @DeleteMapping("/deleteLookupType")
    @ApiOperation("删除指类型")
    public ResultCommon deleteLookupType(){
        return null;
    }
}
