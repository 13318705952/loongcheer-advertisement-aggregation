package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.LookupValue;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupValueSave;
import com.loongcheer.advertisement.api.form.update.LookupValueUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface LookupValueService extends IService<LookupValue> {

    /**
     * 查询值列表信息
     * @return
     */
    ResultCommon queryLookupValue();

    /**
     * 新增值列表信息
     * @param lookupValueSave
     * @return
     */
    ResultCommon addLookupValue(LookupValueSave lookupValueSave);

    /**
     * 更新值列表信息
     * @param lookupTypeUpdate
     * @return
     */
    ResultCommon updateLookupValue(LookupValueUpdate lookupTypeUpdate);

    /**
     * 删除值列表信息
     * @param lookupValueId
     * @return
     */
    ResultCommon deleteLookupValue(String lookupValueId);
}
