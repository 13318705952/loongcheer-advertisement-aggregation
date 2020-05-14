package com.loongcheer.advertisement.admanagement.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loongcheer.advertisement.admanagement.mapper.FlowGroupMapper;
import com.loongcheer.advertisement.admanagement.service.FlowGroupService;
import com.loongcheer.advertisement.api.entity.FlowGroup;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.FlowGroupSave;
import com.loongcheer.advertisement.api.form.update.FlowGroupUpdate;
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
public class FlowGroupServiceImpl extends ServiceImpl<FlowGroupMapper, FlowGroup> implements FlowGroupService {

    @Override
    public ResultCommon queryFlowGroup() {
        return null;
    }

    @Transactional
    @Override
    public ResultCommon addFlowGroup(FlowGroupSave flowGroupSave) {

        int count = baseMapper.selectCount(new QueryWrapper<FlowGroup>().eq("flow_group_name",flowGroupSave.getFlowGroupName()));
        if(count>0){
            ResultCommon.error("流量分组名称以存在，请重新输入");
        }
        FlowGroup flowGroup = new FlowGroup();
        flowGroup.setDefaultGroup(flowGroupSave.getDefaultGroup());
        flowGroup.setFlowGroupName(flowGroupSave.getFlowGroupName());
        flowGroup.setGroupPriority(flowGroupSave.getGroupPriority());
        flowGroup.setRuleId(flowGroupSave.getRuleId());
        flowGroup.setRequests(flowGroupSave.getRequests());
        flowGroup.setRemake(flowGroupSave.getRemake());
        baseMapper.insert(flowGroup);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon updateFlowGroup(FlowGroupUpdate flowGroupUpdate) {
        int count = baseMapper.selectCount(new QueryWrapper<FlowGroup>().eq("flow_group_name",flowGroupUpdate.getFlowGroupName()).ne("flow_group_id",flowGroupUpdate.getFlowGroupId()));
        if(count>0){
            ResultCommon.error("流量分组名称以存在，请重新输入");
        }
        FlowGroup flowGroup = new FlowGroup();
        flowGroup.setFlowGroupId(flowGroupUpdate.getFlowGroupId());
        flowGroup.setDefaultGroup(flowGroupUpdate.getDefaultGroup());
        flowGroup.setFlowGroupName(flowGroupUpdate.getFlowGroupName());
        flowGroup.setGroupPriority(flowGroupUpdate.getGroupPriority());
        flowGroup.setRuleId(flowGroupUpdate.getRuleId());
        flowGroup.setRequests(flowGroupUpdate.getRequests());
        flowGroup.setRemake(flowGroupUpdate.getRemake());
        flowGroup.setUpdateTime(new Date());
        flowGroup.setModifier("system");
        baseMapper.updateById(flowGroup);
        return ResultCommon.ok();
    }

    @Transactional
    @Override
    public ResultCommon deleteFlowGroup(String FlowGroupId) {
        baseMapper.deleteById(FlowGroupId);
        return ResultCommon.ok();
    }
}
