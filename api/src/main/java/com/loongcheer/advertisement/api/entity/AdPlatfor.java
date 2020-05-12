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
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_ad_platfor")
public class AdPlatfor extends Model<AdPlatfor> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告平台id
     */
    @TableId(value = "adv_platfor_id", type = IdType.ID_WORKER_STR)
    private String advPlatforId;

    /**
     * 平台应用id
     */
    @TableField("platfor_app_id")
    private String platforAppId;

    /**
     * 广告平台名称
     */
    @TableField("adv_platfor_name")
    private String advPlatforName;

    /**
     * 是否启用
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

    /**
     * 备注
     */
    private String remake;


    @Override
    protected Serializable pkVal() {
        return this.advPlatforId;
    }

}
