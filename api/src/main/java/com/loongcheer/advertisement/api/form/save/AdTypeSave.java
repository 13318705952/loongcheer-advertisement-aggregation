package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("广告类型新增表单")
public class AdTypeSave {

    @NotNull(message = "广告类型不能为空")
    @ApiModelProperty("广告类型")
    private Integer advType;

    @NotBlank(message = "广告类型名称不能为空")
    @ApiModelProperty("广告类型名称")
    private String advTypeName;

    @NotBlank(message = "广告平台id不能为空")
    @ApiModelProperty("广告平台id")
    private String advPlafforId;

    @ApiModelProperty("备注")
    private String remark;
}
