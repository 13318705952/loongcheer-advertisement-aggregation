package com.loongcheer.advertisement.admanagement.controller;


import com.loongcheer.advertisement.admanagement.service.AdPlacementService;
import com.loongcheer.advertisement.api.entity.AdPlacement;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.AdPlacementSave;
import com.loongcheer.advertisement.api.model.AdPlacementModel;
import com.loongcheer.advertisement.api.util.ValidationUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@RestController
@RequestMapping("/adPlacement")
@Api(value = "广告位信息管理")
public class AdPlacementController {

    @GetMapping("/queryAdPlacement")
    @ApiOperation("查询广告位信息")
    public ResultCommon queryAdPlacement(){
        return null;
    }

    @PostMapping("/addAdPlacement")
    @ApiOperation("新增广告位信息")
    public ResultCommon addAdPlacement(@RequestBody AdPlacementModel adPlacementModel){
        List<AdPlacementSave> adPlacementSaveList = adPlacementModel.getAdPlacementSaveList();
        for(int i=0;i<adPlacementSaveList.size();i++){
            ValidationUtil.ValidResult validResult = ValidationUtil.validateBean(adPlacementSaveList.get(i));
            if(validResult.hasErrors()){
            }
        }
        System.out.println("111");
        return null;
    }

    @PostMapping("/updateAdPlacement")
    @ApiOperation("更新广告位信息")
    public ResultCommon updateAdPlacement(){
        return null;
    }

    @DeleteMapping("/deleteAdPlacement")
    @ApiOperation("删除广告位信息")
    public ResultCommon deleteAdPlacement(){
        return null;
    }
}
