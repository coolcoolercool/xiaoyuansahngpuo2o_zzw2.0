package com.zzw.myo2o.dao;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * author: zzw5005
 * date: 2018/10/25 9:33
 */


public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(5, areaList.size());
        for(Area area : areaList){
            System.out.println(area);
        }
    }
}