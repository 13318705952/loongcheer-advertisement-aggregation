package com.loongcheer.advertisement.admanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.loongcheer.advertisement.api.entity.AdPlatfor;
import com.loongcheer.advertisement.api.query.AdPlatforQuery;
import com.loongcheer.advertisement.api.vo.AdPlatforVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdPlatforMapper extends BaseMapper<AdPlatfor> {
    /**
     * 分页查询平台应用信息
     * @param page
     * @param adPlatforQuery
     * @return
     */
    List<AdPlatforVo> queryAdPlatfor(Page<AdPlatforVo> page, @Param("adPlatfor") AdPlatforQuery adPlatforQuery);


}
