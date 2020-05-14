package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("流量分组更新表单")
public class FlowGroupUpdate {

    @NotBlank(message = "流量分组id不能为空")
    @ApiModelProperty("流量分组id")
    private String flowGroupId;

    @ApiModelProperty("规则id")
    private String ruleId;

    @ApiModelProperty("分组优先级")
    private Integer groupPriority;

    @ApiModelProperty("并发请求数")
    private Integer requests;

    @ApiModelProperty("是否默认分组")
    private Integer defaultGroup;

    @ApiModelProperty("流量分组名称")
    private String flowGroupName;

    @ApiModelProperty("备注")
    private String remark;
}
