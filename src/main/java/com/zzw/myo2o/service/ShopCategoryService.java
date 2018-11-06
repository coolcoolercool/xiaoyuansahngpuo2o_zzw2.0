package com.zzw.myo2o.service;

import com.zzw.myo2o.entity.ShopCategory;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/27 15:44
 */


public interface ShopCategoryService {
    /**
     * 根据查询条件获取ShopCategory列表
     * @param shopCategoryCondition
     * @return
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
