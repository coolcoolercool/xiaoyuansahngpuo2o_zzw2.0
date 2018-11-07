package com.zzw.myo2o.dao;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.entity.LocalAuth;
import com.zzw.myo2o.util.MD5;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * author: zzw5005
 * date: 2018/11/7 10:16
 */


public class LocalAuthDaoTest extends BaseTest {

    @Autowired
    private LocalAuthDao localAuthDao;

    @Test
    public void queryLocalByUserNameAndPwd() {
        LocalAuth localAuth = localAuthDao.queryLocalByUserNameAndPwd("zzw", MD5.getMd5("12345"));
        System.out.println(localAuth.toString());
    }

    @Test
    public void queryLocalByUserId() {
    }

    @Test
    public void insertLocalAuth() {
    }

    @Test
    public void updateLocalAuth() {
    }
}