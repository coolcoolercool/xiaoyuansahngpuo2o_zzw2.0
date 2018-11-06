package com.zzw.myo2o.service.impl;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.ShopCategory;
import com.zzw.myo2o.service.ShopCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/27 15:50
 */


public class ShopCategoryServiceImplTest extends BaseTest {
    @Autowired
    private ShopCategoryService shopCategoryService;

    @Test
    public void getShopCategoryList() {
        ShopCategory shopCategory = new ShopCategory();
        List<ShopCategory> shopCategories = shopCategoryService.getShopCategoryList(shopCategory);
        Assert.assertEquals(19, shopCategories.size());
        for(ShopCategory shopCategory1 : shopCategories){
            System.out.println(shopCategory1);
        }
    }
}