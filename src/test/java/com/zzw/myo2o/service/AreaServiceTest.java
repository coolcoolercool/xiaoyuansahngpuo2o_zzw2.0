package com.zzw.myo2o.service;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * author: zzw5005
 * date: 2018/10/25 10:04
 */


public class AreaServiceTest extends BaseTest {
    @Autowired //通过@service标签，和@Autowried标签，可以自动将service的实现类自动注入
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑",areaList.get(2).getAreaName());
    }
}