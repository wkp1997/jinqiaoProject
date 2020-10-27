package com.jxd.emp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestConfig
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/23
 * @Version 1.0
 */

public class TestConfig {
    public static void main(String[] args) {
        //获取一个Person对象
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);  //会加载Spring容器，扫描@Configuration注解的配置类
        //并将其中@bean注解得方法返回值，加载到Spring得容器中
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getName());
        System.out.println(person.getSex());
    }
}
