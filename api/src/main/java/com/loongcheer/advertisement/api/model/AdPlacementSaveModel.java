package com.loongcheer.advertisement.api.model;

import com.loongcheer.advertisement.api.form.save.AdPlacementSave;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.Valid;
import java.util.List;
@Data
@ApiModel("广告位新增表单列表")
public class AdPlacementSaveModel {
    private List<AdPlacementSave> adPlacementSaveList;
}
