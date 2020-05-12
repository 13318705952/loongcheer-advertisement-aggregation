package com.loongcheer.advertisement.admanagementconsumer.service;

import com.loongcheer.advertisement.api.entity.AdPlacement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//name 为product项目中application.yml配置文件中的application.name;
@FeignClient(name = "admanagement-provider-server")
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface AdPlacementFeignService {
    @RequestMapping(value = "/adPlacement/queryAdPlacement",method = RequestMethod.GET)
    List<AdPlacement> queryAll() ;
}
