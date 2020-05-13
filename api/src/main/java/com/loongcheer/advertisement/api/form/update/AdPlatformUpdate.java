package com.loongcheer.advertisement.api.form.update;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 广告平台更新表单
 */
@Data
@ApiModel("广告平台更新表单")
public class AdPlatformUpdate {

    @NotBlank(message = "广告平台id不能为空")
    @ApiModelProperty("广告平台id")
    private String advPlatformId;

    @ApiModelProperty("广告平台名称")
    private String advPlatformName;

    @ApiModelProperty("平台应用id")
    private String platformAppId;
}
