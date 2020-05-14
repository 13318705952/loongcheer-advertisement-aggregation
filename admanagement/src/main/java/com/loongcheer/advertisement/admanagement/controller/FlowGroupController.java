package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.FlowGroupService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.FlowGroupSave;
import com.loongcheer.advertisement.api.form.update.FlowGroupUpdate;
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
@RequestMapping("/flowGroup")
@Api("流量分组")
public class FlowGroupController {

    @Resource
    private FlowGroupService flowGroupService;

    @GetMapping("/queryFlowGroup")
    @ApiOperation("查询流量分组信息")
    public ResultCommon queryFlowGroup(){
        return null;
    }

    @PostMapping("/addFlowGroup")
    @ApiOperation("新增流量分组信息")
    public ResultCommon addFlowGroup(@Validated FlowGroupSave flowGroupSave){
        return flowGroupService.addFlowGroup(flowGroupSave);
    }

    @PostMapping("/updateFlowGroup")
    @ApiOperation("更新流量分组信息")
    public ResultCommon updateFlowGroup(@Validated FlowGroupUpdate flowGroupUpdate){
        return flowGroupService.updateFlowGroup(flowGroupUpdate);
    }

    @DeleteMapping("/deleteFlowGroup")
    @ApiOperation("删除流量分组信息")
    public ResultCommon deleteFlowGroup(@RequestParam(value = "flowGroupId") String FlowGroupId){
        return flowGroupService.deleteFlowGroup(FlowGroupId);
    }
}
