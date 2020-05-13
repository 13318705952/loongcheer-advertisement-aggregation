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
@RequestMapping("/flowGroup")
@Api("流量分组")
public class FlowGroupController {

    @GetMapping("/queryFlowGroup")
    @ApiOperation("查询流量分组信息")
    public ResultCommon queryFlowGroup(){
        return null;
    }

    @PostMapping("/addFlowGroup")
    @ApiOperation("新增流量分组信息")
    public ResultCommon addFlowGroup(){
        return null;
    }

    @PostMapping("/updateFlowGroup")
    @ApiOperation("更新流量分组信息")
    public ResultCommon updateFlowGroup(){
        return null;
    }

    @DeleteMapping("/deleteFlowGroup")
    @ApiOperation("删除流量分组信息")
    public ResultCommon deleteFlowGroup(){
        return null;
    }
}
