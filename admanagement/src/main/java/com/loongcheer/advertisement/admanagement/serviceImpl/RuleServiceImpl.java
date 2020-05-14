package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.RuleMapper;
import com.loongcheer.advertisement.admanagement.service.RuleService;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.entity.Rule;
import com.loongcheer.advertisement.api.form.save.RuleSave;
import com.loongcheer.advertisement.api.form.update.RuleUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
@Service
public class RuleServiceImpl extends ServiceImpl<RuleMapper, Rule> implements RuleService {

    @Override
    public ResultCommon queryRule() {
        return null;
    }

    @Override
    @Transactional
    public ResultCommon addRule(RuleSave ruleSave) {
        int count = baseMapper.selectCount(new QueryWrapper<Rule>().eq("rule_name",ruleSave.getRuleName()));
        if(count>0){
            return ResultCommon.error("规则名称已经存在，请重新输入");
        }
        Rule rule = new Rule();
        rule.setRemake(ruleSave.getRemark());
        rule.setCondition(ruleSave.getCondition());
        rule.setContain(ruleSave.getContain());
        rule.setDimension(ruleSave.getDimension());
        rule.setIsEnable(ruleSave.getIsEnable());
        rule.setRuleName(ruleSave.getRuleName());
        baseMapper.insert(rule);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon updateRule(RuleUpdate ruleUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<Rule>().eq("rule_name",ruleUpdate.getRuleName()).ne("rule_id",ruleUpdate.getRuleId()));
        if(count>0){
            return ResultCommon.error("规则名称已经存在，请重新输入");
        }
        Rule rule = new Rule();
        rule.setRuleId(ruleUpdate.getRuleId());
        rule.setRemake(ruleUpdate.getRemark());
        rule.setCondition(ruleUpdate.getCondition());
        rule.setContain(ruleUpdate.getContain());
        rule.setDimension(ruleUpdate.getDimension());
        rule.setIsEnable(ruleUpdate.getIsEnable());
        rule.setRuleName(ruleUpdate.getRuleName());
        rule.setUpdateTime(new Date());
        baseMapper.updateById(rule);
        return ResultCommon.ok();
    }

    @Override
    @Transactional
    public ResultCommon deleteRule(String ruleId) {
        baseMapper.deleteById(ruleId);
        return ResultCommon.ok();
    }
}
