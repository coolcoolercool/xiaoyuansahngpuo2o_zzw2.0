package com.zzw.myo2o.service;

import com.zzw.myo2o.entity.HeadLine;

import java.io.IOException;
import java.util.List;

/**
 * author: zzw5005
 * date: 2018/10/31 20:13
 */


public interface HeadLineService {
    /**
     * 根据传入的田间返回指定的头条列表
     * @param headLineCondition
     * @return
     */
    List<HeadLine> queryHeadLineList(HeadLine headLineCondition) throws IOException;
}
