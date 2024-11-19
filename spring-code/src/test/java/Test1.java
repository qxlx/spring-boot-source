package org.qxlx.application;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @author qxlx
 * @date 2024/11/18 21:57
 */
public class Test1 {

    @Test
    public void test2 () {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
        Person bean = ioc.getBean(Person.class);
        Assert.notNull(bean);
    }

}
