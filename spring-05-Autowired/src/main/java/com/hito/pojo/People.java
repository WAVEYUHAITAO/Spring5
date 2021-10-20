package com.hito.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    //@Resource是一种javax原生注解，如果不加参数，他会先通过名字，再通过类型查找，如果通过名子找不到，通过类型查找一定要唯一，不然会报错
    //如果加入name属性，指定是哪一个beanid，就会初始化相应的那个实例
    @Resource(name = "cat1")
    private Cat cat;
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null.否则不允许为空
    @Autowired
    //如果@Autowired自动装配的环境比较复杂，自动装备无法通过一个注解@Autowired完成的时候，我们可以使用@Qualifier(value='xxx')
    @Qualifier(value = "dog222")
    //使用autowired注解连set方法也可以忽略，因为是使用反射实现，类似于autowired=byName
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
