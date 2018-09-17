package com.wstro.test;

import com.wstro.App;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public abstract class AppTest {

}
