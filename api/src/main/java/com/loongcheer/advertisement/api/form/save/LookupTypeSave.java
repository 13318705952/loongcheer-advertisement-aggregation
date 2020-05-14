package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("值类型新增列表")
public class LookupTypeSave {

    @NotBlank(message = "值类型编码不能为空")
    @ApiModelProperty("值类型编码")
    private String lookupTypeCode;

    @NotBlank(message = "值类型名称不能为空")
    @ApiModelProperty("值类型名称")
    private String lookupTypeName;

    @NotNull(message = "是否开启不能为空")
    @ApiModelProperty("是否开启")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
