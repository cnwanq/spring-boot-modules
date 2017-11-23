package com.wanq.springboot.property;

import com.wanq.springboot.property.service.BlogProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    private static final Log log = LogFactory.getLog(ApplicationTest.class);

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test() throws Exception {
        System.out.println(blogProperties.toString());
        Assert.assertEquals("Wanq", blogProperties.getName());
        Assert.assertEquals("SpringBoot", blogProperties.getTitle());
        Assert.assertEquals("Wanq write <<SpringBoot>>", blogProperties.getDesc());

        log.info("随机数测试输出：");
        log.info("随机字符串 : " + blogProperties.getValue());
        log.info("随机int : " + blogProperties.getNumber());
        log.info("随机long : " + blogProperties.getBignumber());
        log.info("随机10以下 : " + blogProperties.getTest1());
        log.info("随机10-20 : " + blogProperties.getTest2());
    }
}
