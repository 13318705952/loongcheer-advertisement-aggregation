package com.loongcheer.advertisement.api.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_platfor_application")
public class PlatforApplication extends Model<PlatforApplication> {

    private static final long serialVersionUID = 1L;

    /**
     * 平台应用id
     */
    @TableId(value = "platfor_app_id", type = IdType.ID_WORKER_STR)
    private String platforAppId;

    /**
     * 应用名称
     */
    @TableField("application_name")
    private String applicationName;

    /**
     * 平台类型
     */
    @TableField("platfor_type")
    private Integer platforType;

    /**
     * 包名称
     */
    @TableField("package_name")
    private String packageName;

    /**
     * 一级分类
     */
    private String category;

    /**
     * 二级分类
     */
    @TableField("sub_category")
    private String subCategory;

    /**
     * appSecretKey
     */
    private String appKey;

    /**
     * appId
     */
    private String appId;

    /**
     * 应用商店
     */
    @TableField("app_shop")
    private String appShop;

    /**
     * 应用商店链接
     */
    @TableField("app_shop_url")
    private String appShopUrl;

    /**
     * 屏幕方向
     */
    @TableField("screen_orientation")
    private Integer screenOrientation;

    /**
     * 图标地址
     */
    @TableField("icon_url")
    private String iconUrl;

    /**
     * 是否可用
     */
    @TableField("is_enable")
    private Integer isEnable;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    private String remake;


    @Override
    protected Serializable pkVal() {
        return this.platforAppId;
    }

}
