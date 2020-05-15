package com.loongcheer.advertisement.api.form.save;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@ApiModel("平台应用新增表单")
public class AdPlatformAppSave {

    /**
     * 应用名称
     */
    @NotBlank(message = "应用名称不能为空")
    @ApiModelProperty("应用名称")
    private String applicationName;

    /**
     * 平台类型
     */
    @NotBlank(message = "ios还是Android平台")
    @ApiModelProperty("平台类型名称")
    private Integer platformType;

    /**
     * 包名称
     */
    @NotBlank(message = "包名称不能为空")
    @ApiModelProperty("包名称")
    private String packageName;

    /**
     * 一级分类
     */
    @NotBlank(message = "一级分类不能为空")
    @ApiModelProperty("一级分类")
    private String category;

    /**
     * 二级分类
     */
    @NotBlank(message = "二级分类不能为空")
    @ApiModelProperty("二级分类")
    private String subCategory;

    /**
     * appSecretKey
     */
    @NotBlank(message = "appSecretKey不能为空")
    @ApiModelProperty("appSecretKey")
    private String appKey;


    /**
     * 应用商店
     */
    @NotBlank(message = "是否上架不能为空")
    @ApiModelProperty("是否上架")
    private String appShop;

    /**
     * 应用商店链接
     */
    @NotBlank(message = "应用商店链接不能为空")
    @ApiModelProperty("应用商店链接")
    private String appShopUrl;

    /**
     * 屏幕方向
     */
    @NotNull(message = "屏幕方向不能为空")
    @ApiModelProperty("屏幕方向")
    private Integer screenOrientation;

    /**
     * 图标地址
     */
    @NotBlank(message = "图标地址不能为空")
    @ApiModelProperty("图标地址")
    private String iconUrl;

    @ApiModelProperty("备注")
    private String remark;
}
