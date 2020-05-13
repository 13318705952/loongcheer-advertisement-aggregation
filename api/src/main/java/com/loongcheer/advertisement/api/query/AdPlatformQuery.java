package com.loongcheer.advertisement.api.query;

import com.loongcheer.advertisement.api.entity.PageCommon;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdPlatformQuery extends PageCommon implements Serializable{
    private static final long serialVersionUID = 1L;

}
