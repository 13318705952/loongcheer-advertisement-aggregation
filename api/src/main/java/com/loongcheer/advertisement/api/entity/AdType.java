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
@TableName("t_ad_type")
public class AdType extends Model<AdType> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告类型id
     */
    @TableId(value = "adv_type_id", type = IdType.ID_WORKER_STR)
    private String advTypeId;

    /**
     * 广告类型
     */
    @TableField("adv_type")
    private Integer advType;

    /**
     * 广告类型名称
     */
    @TableField("adv_type_name")
    private String advTypeName;

    /**
     * 广告平台id
     */
    @TableField("adv_plaffor_id")
    private String advPlafforId;

    /**
     * 是否启用
     */
    @TableField("is_enable")
    private Integer isEnable;

    private String creator;

    private String modifier;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    private String remake;


    @Override
    protected Serializable pkVal() {
        return this.advTypeId;
    }

}
