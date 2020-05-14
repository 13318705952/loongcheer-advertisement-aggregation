package com.loongcheer.advertisement.admanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loongcheer.advertisement.api.entity.LookupType;
import com.loongcheer.advertisement.api.entity.ResultCommon;
import com.loongcheer.advertisement.api.form.save.LookupTypeSave;
import com.loongcheer.advertisement.api.form.update.LookupTypeUpdate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caiww
 * @since 2020-05-08
 */
public interface LookupTypeService extends IService<LookupType> {

    /**
     * 查询值类型信息
     * @return
     */
    ResultCommon queryLookupType();

    /**
     * 新增值类型信息
     * @param lookupTypeSave
     * @return
     */
    ResultCommon addLookupType(LookupTypeSave lookupTypeSave);

    /**
     * 更新值类型信息
     * @param lookupTypeUpdate
     * @return
     */
    ResultCommon updateLookupType(LookupTypeUpdate lookupTypeUpdate);

    /**
     * 删除值类型信息
     * @param lookupTypeId
     * @return
     */
    ResultCommon deleteLookupType(String lookupTypeId);
}
