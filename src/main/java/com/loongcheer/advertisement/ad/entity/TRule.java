package com.loongcheer.advertisement.ad.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import 你自己的父类实体,没有就不用设置!;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-05-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_rule")
public class TRule extends 你自己的父类实体,没有就不用设置!<TRule> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告规则id
     */
    @TableId("rule_id")
    private String ruleId;

    /**
     * 规则名称
     */
    @TableField("rule_name")
    private String ruleName;

    /**
     * 维度
     */
    private Integer dimension;

    /**
     * 条件
     */
    private Integer condition;

    /**
     * 包含
     */
    private String contain;

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
        return this.ruleId;
    }

}
