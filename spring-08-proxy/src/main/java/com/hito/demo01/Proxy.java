package com.hito.demo01;

//代理模式的好处：
//可以使真实角色的操作更加纯粹！不用去关注一些公共的业务
//公共也就交给代理角色，实现了业务的分工
//公共业务发生扩展的时候，方便集中管理

//缺点：
//一个真实角色就会产生一个代理角色，代码量会翻倍，开发效率会变低
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
        heTong();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    private void fare(){
        System.out.println("收中介费");
    }

    //签合同
    private void heTong(){
        System.out.println("签租赁合同");
    }
}
