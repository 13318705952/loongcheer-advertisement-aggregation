package com.loongcheer.advertisement.admanagementconsumer.controller;

import com.loongcheer.advertisement.admanagementconsumer.service.AdPlacementFeignService;
import com.loongcheer.advertisement.api.entity.AdPlacement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdPlacementFeignController {
    @Autowired
    private AdPlacementFeignService adPlacementFeignService;

    @RequestMapping(value = "/consumer/adPlacement/queryAdPlacement",method = RequestMethod.GET)
    public List<AdPlacement> getAdPlacement(){
        return adPlacementFeignService.queryAll();
    }

}
