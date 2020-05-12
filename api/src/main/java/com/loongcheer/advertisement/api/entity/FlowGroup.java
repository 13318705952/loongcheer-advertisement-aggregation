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
@TableName("t_flow_group")
public class FlowGroup extends Model<FlowGroup> {

    private static final long serialVersionUID = 1L;

    /**
     * 流量分组id
     */
    @TableId(value = "flow_group_id", type = IdType.ID_WORKER_STR)
    private String flowGroupId;

    /**
     * 广告规则id
     */
    @TableField("rule_id")
    private String ruleId;

    /**
     * 分组优先级
     */
    @TableField("group_priority")
    private Integer groupPriority;

    /**
     * 并发请求数
     */
    private Integer requests;

    /**
     * 是否默认分组
     */
    @TableField("default_group")
    private Integer defaultGroup;

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
        return this.flowGroupId;
    }

}
