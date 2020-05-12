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
@TableName("t_user_init_log_mess")
public class UserInitLogMess extends Model<UserInitLogMess> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    /**
     * 地区
     */
    private String area;

    /**
     * 日期时间
     */
    private Date time;

    /**
     * 网络类型
     */
    @TableField("network_type")
    private String networkType;

    @TableField("app_id")
    private String appId;

    @TableField("app_key")
    private String appKey;

    /**
     * 应用版本
     */
    private String version;

    /**
     * 应用包名
     */
    @TableField("package_name")
    private String packageName;

    /**
     * sdk版本
     */
    @TableField("sdk_version")
    private String sdkVersion;

    /**
     * 系统版本
     */
    @TableField("system_version")
    private String systemVersion;

    /**
     * 设备id
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 设备类型
     */
    @TableField("device_type")
    private String deviceType;

    /**
     * 设备品牌
     */
    @TableField("device_brand")
    private String deviceBrand;

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
        return this.id;
    }

}
