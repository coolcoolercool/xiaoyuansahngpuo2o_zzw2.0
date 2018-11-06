package com.zzw.myo2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: zzw5005
 * date: 2018/10/25 9:34
 */

/*
* 配置spring和junit整合，junit启动时候加载springIOC容器
* */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
@ContextConfiguration({ "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml" })
public class BaseTest {
}
