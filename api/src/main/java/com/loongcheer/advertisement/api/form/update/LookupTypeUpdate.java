package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("值类型更新列表")
public class LookupTypeUpdate {

    @NotBlank(message = "值类型ID不能为空")
    @ApiModelProperty("值类型id")
    private String lookupTypeId;

    @ApiModelProperty("值类型编码")
    private String lookupTypeCode;

    @ApiModelProperty("值类型名称")
    private String lookupTypeName;

    @ApiModelProperty("是否开启")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
