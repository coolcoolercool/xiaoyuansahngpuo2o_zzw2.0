package com.zzw.myo2o.dao;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.HeadLine;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/31 20:00
 */


public class HeadLineDaoTest extends BaseTest {

    @Autowired
    private HeadLineDao headLineDao;

    @Test
    public void selectHeadLineList() {
        HeadLine headLineCondition = new HeadLine();

        headLineCondition.setEnableStatus(0);

        //查询不可用的头条信息 1条
        List<HeadLine> headLineList = headLineDao.selectHeadLineList(headLineCondition);
        Assert.assertEquals(1, headLineList.size());
        for(HeadLine headLine : headLineList){
            System.out.println(headLine);
        }

        //查询可用的头条信息 4条
        headLineCondition.setEnableStatus(1);
        headLineList = headLineDao.selectHeadLineList(headLineCondition);
        Assert.assertEquals(4, headLineList.size());
        for(HeadLine headLine : headLineList){
            System.out.println(headLine);
        }

        //查询全部状态的头条信息 4条
        headLineList = headLineDao.selectHeadLineList(new HeadLine());
        Assert.assertEquals(5, headLineList.size());
        for(HeadLine headLine : headLineList){
            System.out.println(headLine);
        }
    }
}