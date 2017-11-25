package com.wanq.springboot.log4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.apache.log4j.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void test() throws Exception {
        logger.info("输出info");
        logger.debug("输出debug");
        logger.error("输出error");
    }
}
