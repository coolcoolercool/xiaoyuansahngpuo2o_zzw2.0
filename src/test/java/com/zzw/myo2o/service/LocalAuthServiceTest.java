package com.zzw.myo2o.service;

import com.zzw.myo2o.BaseTest;
import com.zzw.myo2o.dao.LocalAuthDao;
import com.zzw.myo2o.entity.LocalAuth;
import com.zzw.myo2o.util.MD5;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * author: zzw5005
 * date: 2018/11/7 10:15
 */


public class LocalAuthServiceTest extends BaseTest {
    @Autowired
    private LocalAuthService localAuthService;

    @Test
    public void getLocalAuthByUserNameAndPwd() {
        LocalAuth localAuth = localAuthService.getLocalAuthByUserNameAndPwd("zzw", MD5.getMd5("12345"));
        Assert.assertEquals("zzw", localAuth.getUserName());
        System.out.println(localAuth.toString());
    }

    @Test
    public void getLocalAuthByUserId() {
    }

    @Test
    public void register() {
    }

    @Test
    public void bindLocalAuth() {
    }

    @Test
    public void modifyLocalAuth() {
    }
}