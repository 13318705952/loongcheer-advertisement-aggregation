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
@TableName("t_rule")
public class Rule extends Model<Rule> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告规则id
     */
    @TableId(value = "rule_id", type = IdType.ID_WORKER_STR)
    private String ruleId;

    /**
     * 规则名称
     */
    @TableField("rule_name")
    private String ruleName;

    /**
     * 维度
     */
    @TableField("dimension")
    private Integer dimension;

    /**
     * 条件
     */
    @TableField("condition")
    private Integer condition;

    /**
     * 包含
     */
    @TableField("contain")
    private String contain;

    @TableField("is_enable")
    private Integer isEnable;

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
        return this.ruleId;
    }

}
