package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ApiModel("值列表新增表单")
@Data
public class LookupValueSave {

    @NotBlank(message = "值列表编码不能为空")
    @ApiModelProperty("值列表编码")
    private String lookupValueCode;

    @NotBlank(message = "值列表名称不能为空")
    @ApiModelProperty("值列表名称")
    private String lookupValueName;

    @NotBlank(message = "值类型编码不能为空")
    @ApiModelProperty("值类型编码")
    private String lookupTypeCode;

    @ApiModelProperty("扩展属性1")
    private String extendsValue1;

    @ApiModelProperty("扩展属性2")
    private String extendsValue2;

    @ApiModelProperty("扩展属性3")
    private String extendsValue3;

    @NotNull(message = "是否可用不能为空")
    @ApiModelProperty("是否可用")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
