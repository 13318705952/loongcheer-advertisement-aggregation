package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.RuleService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.RuleSave;
import com.loongcheer.advertisement.api.form.update.RuleUpdate;
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
@RequestMapping("/rule")
@ApiOperation("规则管理")
public class RuleController {

    @Resource
    private RuleService ruleService;

    @GetMapping("/queryRule")
    @ApiOperation("查询平台应用")
    public ResultCommon queryRule(){
        return null;
    }

    @PostMapping("/addRule")
    @ApiOperation("新增平台应用")
    public ResultCommon addRule(@Validated RuleSave ruleSave){
        return ruleService.addRule(ruleSave);
    }

    @PostMapping("/updateRule")
    @ApiOperation("更新平台应用")
    public ResultCommon updateRule(@Validated RuleUpdate ruleUpdate){
        return ruleService.updateRule(ruleUpdate);
    }

    @DeleteMapping("/deleteRule")
    @ApiOperation("删除平台应用")
    public ResultCommon deleteRule(@RequestParam(value = "ruleId",required = true) String ruleId){
        return ruleService.deleteRule(ruleId);
    }
}
