package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("规则更新表单")
public class RuleUpdate {

    @NotBlank(message = "规程id不能为空")
    @ApiModelProperty("规则id")
    private String ruleId;

    @ApiModelProperty("规则名称")
    private String ruleName;

    @ApiModelProperty("维度")
    private Integer dimension;

    @ApiModelProperty("条件")
    private Integer condition;

    @ApiModelProperty("包含")
    private String contain;

    @ApiModelProperty("是否启用")
    private Integer isEnable;

    @ApiModelProperty("备注")
    private String remark;
}
