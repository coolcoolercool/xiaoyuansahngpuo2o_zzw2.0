package com.zzw.myo2o.service;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * author: zzw5005
 * date: 2018/11/7 9:01
 */


public class ShopCategoryServiceTest extends BaseTest {

    @Autowired
    private ShopCategoryService shopCategoryService;

    @Test
    public void getShopCategoryList() {

        List<ShopCategory> shopCategories;

        // 查询 ShopCategory为null的情况，即查询parent_id is null
        shopCategories = shopCategoryService.getShopCategoryList(null);
        for (ShopCategory shopCategory2 : shopCategories) {
            System.out.println("-----||" + shopCategory2);
        }

        // 查询 ShopCategory不为空的情况
        ShopCategory shopCategory = new ShopCategory();
        shopCategories = shopCategoryService.getShopCategoryList(shopCategory);
        for (ShopCategory shopCategory2 : shopCategories) {
            System.out.println("----->>" + shopCategory2);
        }

        // 查询对应父类下的目录
        ShopCategory parent = new ShopCategory();
        ShopCategory child = new ShopCategory();

        parent.setShopCategoryId(1L);
        child.setParentId(parent);

        shopCategories = shopCategoryService.getShopCategoryList(child);
        for (ShopCategory shopCategory2 : shopCategories) {
            System.out.println("-----**" + shopCategory2);
        }

    }
}