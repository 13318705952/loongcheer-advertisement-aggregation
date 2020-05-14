package com.loongcheer.advertisement.admanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.loongcheer.advertisement.api.entity.AdPlatform;
import com.loongcheer.advertisement.api.query.AdPlatformQuery;
import com.loongcheer.advertisement.api.vo.AdPlatformVo;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface AdPlatformMapper extends BaseMapper<AdPlatform> {
    /**
     * 分页查询平台应用信息
     * @param page
     * @param adPlatforQuery
     * @return
     */
    List<AdPlatformVo> queryAdPlatformByPage(Page<AdPlatformVo> page, @Param("adPlatform") AdPlatformQuery adPlatforQuery);

    /**
     * 查询广告平台信息
     * @param adPlatformQuery
     * @return
     */
    List<AdPlatformVo> queryAdPlatform(@Param("adPlatform") AdPlatformQuery adPlatformQuery,@Param("userName") String userName);
}
