package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 广告平台添加表单
 */
@Data
@ApiModel("广告平台添加表单")
public class AdPlatformSave {

    @NotBlank(message = "广告平台名称不能为空")
    @ApiModelProperty("广告平台名称")
    private String advPlatformName;

    @ApiModelProperty("平台应用id")
    private String platformAppId;

    @ApiModelProperty("平台拓展属性")
    private String extendParams;

    @ApiModelProperty("报表API")
    @NotNull(message = "是否开通报表api不能为空")
    private Integer isReportApi;

    @NotNull
    @ApiModelProperty("广告平台编码")
    private Integer advPlatformCode;
}
