package com.zzw.myo2o.service.impl;

import com.zzw.myo2o.dao.ShopCategoryDao;
import com.zzw.myo2o.entity.ShopCategory;
import com.zzw.myo2o.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/27 15:47
 */

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {

        return shopCategoryDao.queryShopCategory(shopCategoryCondition);
    }
}
