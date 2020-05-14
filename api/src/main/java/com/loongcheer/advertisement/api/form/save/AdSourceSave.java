package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel("广告源新增表单")
@Data
public class AdSourceSave {

    @NotBlank(message = "广告应用id不为空")
    @ApiModelProperty("广告应用id")
    private String appId;

    @NotBlank(message = "流量分组id不能为空")
    @ApiModelProperty("流量分组id")
    private String flowGroupId;

    @NotBlank(message = "广告源名称不能为空")
    @ApiModelProperty("广告源名称")
    private String sourceName;

    @NotNull(message = "是否开通广告源不能为空")
    @ApiModelProperty("是否开通广告源")
    private Integer isOpen;

    @NotNull(message = "是否启用不能为空")
    @ApiModelProperty("是否启用")
    private Integer isEnable;

    @ApiModelProperty("平台名称")
    private String platformName;

    @ApiModelProperty("placement_id")
    private String placementId;

    @ApiModelProperty("game_id")
    private String gameId;

    @ApiModelProperty("ecmp")
    private BigDecimal ecmp;

    @ApiModelProperty("备注")
    private String remark;
}
