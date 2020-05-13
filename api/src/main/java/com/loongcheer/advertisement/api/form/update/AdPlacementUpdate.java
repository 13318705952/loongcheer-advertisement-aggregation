package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
@ApiModel("广告位更新表单")
public class AdPlacementUpdate {

    @NotBlank(message = "广告位id不能为空")
    @ApiModelProperty("广告位id")
    private String advPlacementId;

    @ApiModelProperty("广告位名称")
    private String advPlacementName;

    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("appKey")
    private String appKey;

    @ApiModelProperty("广告类型id")
    private String advTypeId;

    @ApiModelProperty("备注")
    private String remake;

    @ApiModelProperty("是否启用")
    private Integer isEnable;
}
