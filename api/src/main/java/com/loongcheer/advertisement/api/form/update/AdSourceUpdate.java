package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@ApiModel("广告源更新表单")
@Data
public class AdSourceUpdate {

    @NotBlank(message = "广告源id不能为空")
    @ApiModelProperty("广告源id")
    private String advSourceId;

    @ApiModelProperty("广告应用id")
    private String appId;

    @ApiModelProperty("流量分组id")
    private String flowGroupId;

    @ApiModelProperty("广告源名称")
    private String sourceName;

    @ApiModelProperty("是否开通广告源")
    private Integer isOpen;

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
