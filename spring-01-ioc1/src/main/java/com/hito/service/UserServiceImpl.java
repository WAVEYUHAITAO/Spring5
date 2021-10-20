package com.hito.service;

import com.hito.dao.UserDao;
import com.hito.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //利用set实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
