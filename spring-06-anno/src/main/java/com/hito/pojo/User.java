package com.hito.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.hito.pojo.User"/>
//@Component组件
@Component
@Scope("singleton")
public class User {
    //相当于<property name="name" value="海涛"/>
    @Value("海涛")
    public String name;
}
