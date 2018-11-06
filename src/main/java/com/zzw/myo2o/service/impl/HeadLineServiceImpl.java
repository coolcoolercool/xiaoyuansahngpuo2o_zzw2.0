package com.zzw.myo2o.service.impl;

import com.zzw.myo2o.dao.HeadLineDao;
import com.zzw.myo2o.entity.HeadLine;
import com.zzw.myo2o.service.HeadLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/31 20:16
 */

@Service
public class HeadLineServiceImpl implements HeadLineService {

    @Autowired
    private HeadLineDao headLineDao;


    @Override
    public List<HeadLine> queryHeadLineList(HeadLine headLineCondition) throws IOException {
        return headLineDao.selectHeadLineList(headLineCondition);
    }
}
