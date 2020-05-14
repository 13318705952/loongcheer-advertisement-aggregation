package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.entity.Rule;
import com.loongcheer.advertisement.api.form.save.RuleSave;
import com.loongcheer.advertisement.api.form.update.RuleUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface RuleService extends IService<Rule> {

    /**
     * 查询规则信息
     * @return
     */
    ResultCommon queryRule();

    /**
     * 新增规则信息
     * @param ruleSave
     * @return
     */
    ResultCommon addRule(RuleSave ruleSave);

    /**
     * 更新规则信息
     * @param ruleUpdate
     * @return
     */
    ResultCommon updateRule(RuleUpdate ruleUpdate);

    /**
     * 删除规则信息
     * @param ruleId
     * @return
     */
    ResultCommon deleteRule(String ruleId);
}
