package com.hito.config;

import com.hito.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会被spring容器托管，注册到容器里，因为它本来就是component
@Configuration //代表这是一个配置类，就和我们之前看到的beans.xml一样
@ComponentScan("com.hito.pojo")
//引入其他配置类
@Import(HitoConfig2.class)
public class HitoConfig {
    //注册一个bean，就像我们之前写的一个bean标签
    //这个方法的名字就相当于bean标签的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean中的对象
    }
}
