package com.loongcheer.advertisement.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PageCommon {
    //当前页
    private int page;
    //页面接受数据大小
    private int pageSize;
}
