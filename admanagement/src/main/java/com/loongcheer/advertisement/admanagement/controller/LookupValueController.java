package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.LookupValueService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupValueSave;
import com.loongcheer.advertisement.api.form.update.LookupValueUpdate;
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
@RequestMapping("/lookupValue")
@Api("值列表")
public class LookupValueController {

    @Resource
    private LookupValueService lookupValueService;

    @GetMapping("/queryLookupValue")
    @ApiOperation("查询值列表数据")
    public ResultCommon queryLookupValue(){
        return null;
    }

    @PostMapping("/addLookupValue")
    @ApiOperation("新增值列表数据")
    public ResultCommon addLookupValue(@Validated LookupValueSave lookupValueSave){
        return lookupValueService.addLookupValue(lookupValueSave);
    }

    @PostMapping("/updateLookupValue")
    @ApiOperation("更新值列表数据")
    public ResultCommon updateLookupValue(@Validated LookupValueUpdate lookupValueUpdate){
        return lookupValueService.updateLookupValue(lookupValueUpdate);
    }

    @DeleteMapping("/")
    @ApiOperation("删除值列表数据")
    public ResultCommon deleteLookupValue(@RequestParam(value = "lookupValueId",required = true) String lookupValueId){
        return lookupValueService.deleteLookupValue(lookupValueId);
    }
}
