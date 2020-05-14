package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("广告位新增表单")
public class AdPlacementSave {

    @NotBlank(message = "广告位名称不能为空")
    @ApiModelProperty("广告位名称")
    private String advPlacementName;

    @NotBlank(message = "appId不能为空")
    @ApiModelProperty("appId")
    private String appId;

    @NotBlank(message = "appKey不能为空")
    @ApiModelProperty("appKey")
    private String appKey;

    @NotBlank(message = "广告类型id不能为空")
    @ApiModelProperty("广告类型id")
    private String advTypeId;

    @NotNull(message = "是否启用不可用")
    @ApiModelProperty("是否启用")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
