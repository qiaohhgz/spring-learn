package com.jim.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiao on 15/7/6.
 */
public class Bootstrap {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/application.xml");
        context.registerShutdownHook();

        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean.toString());
    }
}
