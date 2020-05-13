package com.loongcheer.advertisement.api.form.save;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 广告平台添加表单
 */
@Data
@ApiModel("广告平台添加表单")
public class AdPlatforSave {

    @NotBlank(message = "广告平台名称不能为空")
    @ApiModelProperty("广告平台名称")
    private String advPlatforName;

    @ApiModelProperty("平台应用id")
    private String platforAppId;
}
