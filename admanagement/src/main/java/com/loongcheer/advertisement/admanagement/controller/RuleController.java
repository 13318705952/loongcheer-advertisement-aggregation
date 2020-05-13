package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.api.entity.ResultCommon;
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
@RequestMapping("/rule")
@ApiOperation("规则管理")
public class RuleController {
    @GetMapping("/queryRule")
    @ApiOperation("查询平台应用")
    public ResultCommon queryRule(){
        return null;
    }

    @PostMapping("/addRule")
    @ApiOperation("新增平台应用")
    public ResultCommon addRule(){
        return null;
    }

    @PostMapping("/updateRule")
    @ApiOperation("更新平台应用")
    public ResultCommon updateRule(){
        return null;
    }

    @DeleteMapping("/deleteRule")
    @ApiOperation("删除平台应用")
    public ResultCommon deleteRule(){
        return null;
    }
}
