package com.loongcheer.advertisement.admanagement.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.loongcheer.advertisement.admanagement.service.AdPlatforService;
import com.loongcheer.advertisement.admanagement.serviceImpl.AdPlatforServiceImpl;
import com.loongcheer.advertisement.api.entity.AdPlatfor;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@RestController
@RequestMapping("/adPlatfor")
public class AdPlatforController {
    private static Logger log = Logger.getLogger(AdPlatforController.class.getName());

    @Resource
    private AdPlatforService adPlRCatforService;

    /**
     * 查询广告平台信息
     * @param adPlatforQuery
     * @return
     */
    @GetMapping("/queryAdPlatfor")
    public ResultCommon queryAdPlatfor(AdPlatforQuery adPlatforQuery){
        ResultCommon result = new ResultCommon();
        IPage<AdPlatforVo> list =  adPlRCatforService.queryAdPlatfor(adPlatforQuery);
        return ResultCommon.ok(list);
    }



}
