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
@RequestMapping("/lookupValue")
@Api("值列表")
public class LookupValueController {

    @GetMapping("/queryLookupValue")
    @ApiOperation("查询值列表数据")
    public ResultCommon queryLookupValue(){
        return null;
    }

    @PostMapping("/addLookupValue")
    @ApiOperation("新增值列表数据")
    public ResultCommon addLookupValue(){
        return null;
    }

    @PostMapping("/updateLookupValue")
    @ApiOperation("更新值列表数据")
    public ResultCommon updateLookupValue(){
        return null;
    }

    @DeleteMapping("/")
    @ApiOperation("删除值列表数据")
    public ResultCommon deleteLookupValue(){
        return null;
    }
}
