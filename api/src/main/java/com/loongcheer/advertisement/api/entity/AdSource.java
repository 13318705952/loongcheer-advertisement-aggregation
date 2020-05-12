package com.loongcheer.advertisement.api.entity;

import java.math.BigDecimal;
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
@TableName("t_ad_source")
public class AdSource extends Model<AdSource> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告源id
     */
    @TableId(value = "adv_source_id", type = IdType.ID_WORKER_STR)
    private String advSourceId;

    /**
     * 广告应用id
     */
    @TableField("app_id")
    private String appId;

    /**
     * 流量分组id
     */
    @TableField("flow_group_id")
    private String flowGroupId;

    /**
     * 广告源名称
     */
    @TableField("source_name")
    private String sourceName;

    /**
     * 是否开通广告源
     */
    @TableField("is_open")
    private Integer isOpen;

    /**
     * 是否启用
     */
    @TableField("is_enable")
    private Integer isEnable;

    /**
     * 平台名称
     */
    @TableField("platfor_name")
    private String platforName;

    @TableField("placement_id")
    private String placementId;

    @TableField("game_id")
    private String gameId;

    /**
     * ecmp价值
     */
    private BigDecimal ecmp;

    private String creator;

    private String modifier;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    private String remake;


    @Override
    protected Serializable pkVal() {
        return this.advSourceId;
    }

}
