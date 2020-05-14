package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.FlowGroup;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.FlowGroupSave;
import com.loongcheer.advertisement.api.form.update.FlowGroupUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface FlowGroupService extends IService<FlowGroup> {

    /**
     * 查询流量分组数据
     * @return
     */
    ResultCommon queryFlowGroup();

    /**
     * 新增流量分组数据
     * @param flowGroupSave
     * @return
     */
    ResultCommon addFlowGroup(FlowGroupSave flowGroupSave);

    /**
     * 更新流量分组数据
     * @param flowGroupUpdate
     * @return
     */
    ResultCommon updateFlowGroup(FlowGroupUpdate flowGroupUpdate);

    /**
     * 删除流量分组数据
     * @param FlowGroupId
     * @return
     */
    ResultCommon deleteFlowGroup(String FlowGroupId);
}
