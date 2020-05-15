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
 *  广告平台表
 * @author caiww
 * @since 2020-05-08
 */
/*
    MybatisPlus会默认使用实体类的类名到数据库中找对应的表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_ad_platform")
public class AdPlatform extends Model<AdPlatform> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告平台id
     * @TableId：
     *  value:指定表中的主键列的列名，如果实体属性名与列名一致，可以省略不指定
     *  type：指定主键策略
     */
    @TableId(value = "adv_platform_id", type = IdType.ID_WORKER_STR)
    private String advPlatformId;

    /**
     * 平台应用id
     */
    @TableField("platform_app_id")
    private String platformAppId;

    /**
     * 广告平台名称
     */
    @TableField("adv_platform_name")
    private String advPlatformName;

    /**
     * 是否启用
     */
    @TableField("is_open")
    private Integer isOpen;

    /**
     * 是否启用
     */
    @TableField("is_enable")
    private Integer isEnable;

    /**
     * 创建人
     */
    @TableField("creator")
    private String creator;

    /**
     * 修改人
     */
    @TableField("modifier")
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

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 是否开通报表api
     */
    @TableField("是否开通报表api")
    private Integer isReportApi;

    @TableField("广告平台编码")
    private Integer advPlatformCode;

    @TableField("扩展属性")
    private String extendParams;

    @Override
    protected Serializable pkVal() {
        return this.advPlatformId;
    }

}
