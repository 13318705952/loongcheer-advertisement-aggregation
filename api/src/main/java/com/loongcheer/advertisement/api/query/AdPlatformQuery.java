package com.loongcheer.advertisement.api.query;

import com.loongcheer.advertisement.api.entity.PageCommon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("广告平台查询条件")
public class AdPlatformQuery extends PageCommon implements Serializable{
    private static final long serialVersionUID = 1L;
    @NotEmpty(message = "开始时间不能为空")
    @ApiModelProperty("开始时间")
    private Date startDate;

    @NotEmpty(message = "结束时间不能为空")
    @ApiModelProperty("结束时间")
    private Date endDate;

    @ApiModelProperty("广告平台编码")
    private Integer advPlatformCode;

    @ApiModelProperty("是否开通报表API")
    private Integer isReportApi;

    @ApiModelProperty("是否启用")
    private Integer isEnanle;
}
