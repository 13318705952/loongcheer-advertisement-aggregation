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
@TableName("t_lookup_value")
public class LookupValue extends Model<LookupValue> {

    private static final long serialVersionUID = 1L;

    /**
     * 值列表id
     */
    @TableId(value = "lookup_value_id", type = IdType.ID_WORKER_STR)
    private String lookupValueId;

    /**
     * 值列表编码
     */
    @TableField("lookup_value_code")
    private String lookupValueCode;

    /**
     * 值列表名称
     */
    @TableField("lookup_value_name")
    private String lookupValueName;

    /**
     * 值类型编码
     */
    @TableField("lookup_type_code")
    private String lookupTypeCode;

    /**
     * 扩展属性1
     */
    @TableField("extends_value1")
    private String extendsValue1;

    /**
     * 扩展属性2
     */
    @TableField("extends_value2")
    private String extendsValue2;

    /**
     * 扩展属性3
     */
    @TableField("extends_value3")
    private String extendsValue3;

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
        return this.lookupValueId;
    }

}
