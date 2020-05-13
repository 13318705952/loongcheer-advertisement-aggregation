package com.loongcheer.advertisement.api.vo;

import com.loongcheer.advertisement.api.entity.AdPlatform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdPlatformVo extends AdPlatform implements Serializable {
}
