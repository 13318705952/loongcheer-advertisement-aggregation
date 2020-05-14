package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("规则新增表单")
public class RuleSave {

    @NotBlank(message = "规则名称不能为空")
    @ApiModelProperty("规则名称")
    private String ruleName;

    @NotNull(message = "维度不能为空")
    @ApiModelProperty("维度")
    private Integer dimension;

    @NotNull(message = "条件不能为空")
    @ApiModelProperty("条件")
    private Integer condition;

    @NotBlank(message = "包含内容不能为空")
    @ApiModelProperty("包含")
    private String contain;

    @NotNull(message = "是否启用不能为空")
    @ApiModelProperty("是否启用")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
