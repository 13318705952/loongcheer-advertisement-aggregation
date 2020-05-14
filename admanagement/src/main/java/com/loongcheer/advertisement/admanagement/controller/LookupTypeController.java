package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.LookupTypeService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupTypeSave;
import com.loongcheer.advertisement.api.form.update.LookupTypeUpdate;
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
@RequestMapping("/lookupType")
@Api("值类型")
public class LookupTypeController {

    @Resource
    private LookupTypeService lookupTypeService;

    @GetMapping("/queryLookupType")
    @ApiOperation("查询值类型")
    public ResultCommon queryLookupType(){
        return null;
    }

    @PostMapping("/addLookupType")
    @ApiOperation("新增值类型")
    public ResultCommon addLookupType(@Validated LookupTypeSave lookupTypeSave){
        return lookupTypeService.addLookupType(lookupTypeSave);
    }

    @PostMapping("/updateLookupType")
    @ApiOperation("更新值类型")
    public ResultCommon updateLookupType(@Validated LookupTypeUpdate lookupTypeUpdate){
        return lookupTypeService.updateLookupType(lookupTypeUpdate);
    }

    @DeleteMapping("/deleteLookupType")
    @ApiOperation("删除指类型")
    public ResultCommon deleteLookupType(@RequestParam(value = "lookupTypeId",required = true) String lookupTypeId){
        return lookupTypeService.deleteLookupType(lookupTypeId);
    }
}
