package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("广告类型更新表单")
public class AdTypeUpdate {

    @ApiModelProperty("广告平台id")
    @NotBlank(message = "广告类型id不能为空")
    private String advTypeId;

    @ApiModelProperty("广告类型")
    private Integer advType;

    @ApiModelProperty("广告类型名称")
    private String advTypeName;

    @ApiModelProperty("广告平台id")
    private String advPlafforId;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("是否启用")
    private Integer isEnable;
}
