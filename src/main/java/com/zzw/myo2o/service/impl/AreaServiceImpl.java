package com.zzw.myo2o.service.impl;

import com.zzw.myo2o.dao.AreaDao;
import com.zzw.myo2o.entity.Area;
import com.zzw.myo2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/25 9:58
 */

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
