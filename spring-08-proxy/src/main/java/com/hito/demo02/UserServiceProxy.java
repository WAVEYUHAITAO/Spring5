package com.hito.demo02;

public class UserServiceProxy implements UserService{

    UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        System.out.println("新业务");
    }

    @Override
    public void delete() {
        userService.delete();
        System.out.println("新业务");
    }

    @Override
    public void update() {
        userService.update();
        System.out.println("新业务");
    }

    @Override
    public void query() {
        userService.query();
        System.out.println("新业务");
    }
}
