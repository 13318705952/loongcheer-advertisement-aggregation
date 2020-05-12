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
@TableName("t_lookup_type")
public class LookupType extends Model<LookupType> {

    private static final long serialVersionUID = 1L;

    /**
     * 值类型id
     */
    @TableId(value = "lookup_type_id", type = IdType.ID_WORKER_STR)
    private String lookupTypeId;

    /**
     * 值类型编码
     */
    @TableField("lookup_type_code")
    private String lookupTypeCode;

    /**
     * 值类型名称
     */
    @TableField("lookup_type_name")
    private String lookupTypeName;

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
        return this.lookupTypeId;
    }

}
