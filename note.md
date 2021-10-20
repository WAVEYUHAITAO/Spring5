## 常用依赖
```xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
```
## 注解说明
@Autowired:自动装配通过类型，名字.

如果Autowired不能唯一自动装备上属性，则需要通过@Qualifier(value="xxx);

@Resource :自动装备通过名字，类型

@Component:组件，放在类上，说明这个类被Spring管理了，就是bean!
    @Service @Repository @Controller
    这四个注解作用是一样的，都是装配到xml里，只是再不同的层用的名字不同


@Value:放在属性上来赋值

@Scope("singleton"):作用域

##小结

xml用来管理bean,注解只负责完成属性注入
我们在使用中，需要注意一个问题，必须让注解生效，需要开启注解支持
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--指定要扫描的包，这个包下的注解就会生效-->
    <context:component-scan base-package="com.hito"/>
    <!--开启注解支持-->
    <context:annotation-config/>
```

##完全使用Java方式配置Spring

我们现在要完全不适用Sping的xml配置，全权交给java来做
javaConfig是Spring的一个子项目，再spring4后，成为核心功能