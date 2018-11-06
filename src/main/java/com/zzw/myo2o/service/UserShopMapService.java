package com.zzw.myo2o.service;

import com.zzw.myo2o.dto.UserShopMapExecution;
import com.zzw.myo2o.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
                                         int pageIndex, int pageSize);

}
