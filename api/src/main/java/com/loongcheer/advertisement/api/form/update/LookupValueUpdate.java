package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("值列表更新表单")
@Data
public class LookupValueUpdate {

    @NotBlank(message = "值列表id不能为空")
    @ApiModelProperty("值列表id")
    private String lookupValueId;

    @ApiModelProperty("值列表编码")
    private String lookupValueCode;

    @ApiModelProperty("值列表名称")
    private String lookupValueName;

    @ApiModelProperty("值类型编码")
    private String lookupTypeCode;

    @ApiModelProperty("扩展属性1")
    private String extendsValue1;

    @ApiModelProperty("扩展属性2")
    private String extendsValue2;

    @ApiModelProperty("扩展属性3")
    private String extendsValue3;

    @ApiModelProperty("是否可用")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
