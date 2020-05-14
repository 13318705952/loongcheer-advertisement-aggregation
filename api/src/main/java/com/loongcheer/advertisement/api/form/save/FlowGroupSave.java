package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("流量分组新增表单")
public class FlowGroupSave {

    @NotBlank(message = "规则id不能为空")
    @ApiModelProperty("规则id")
    private String ruleId;

    @NotNull(message = "分组优先级不能为空")
    @ApiModelProperty("分组优先级")
    private Integer groupPriority;

    @NotBlank(message = "并发请求数不能为空")
    @ApiModelProperty("并发请求数")
    private Integer requests;

    @NotBlank(message = "是否默认分组不能为空")
    @ApiModelProperty("是否默认分组")
    private Integer defaultGroup;

    @NotBlank(message = "流量分组名称不能为空")
    @ApiModelProperty("流量分组名称")
    private String flowGroupName;

    @ApiModelProperty("备注")
    private String remark;
}
