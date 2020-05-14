package com.loongcheer.advertisement.api.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

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
@TableName("t_ad_placement")
public class AdPlacement extends Model<AdPlacement> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告位id
     */
    @TableId(value = "adv_placement_id", type = IdType.ID_WORKER_STR)
    private String advPlacementId;

    /**
     * 广告位名称
     */
    @TableField("adv_placement_name")
    private String advPlacementName;

    /**
     * 是否启用
     */
    @TableField("is_enable")
    private Integer isEnable;

    @TableField("app_id")
    private String appId;

    @TableField("app_key")
    private String appKey;

    /**
     * 广告类型id
     */
    @TableField("adv_type_id")
    private String advTypeId;

    @TableField("creator")
    private String creator;

    @TableField("modifier")
    private String modifier;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("remark")
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.advPlacementId;
    }

}
