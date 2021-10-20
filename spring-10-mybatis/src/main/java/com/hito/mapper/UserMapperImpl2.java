package com.hito.mapper;

import com.hito.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
//继承sqlSessionDaoSupport,可以帮助我们创建sqlsessiontemplate，这种方式下，spring-dao离的sqlsession可以省略。
//但是由于SqlSessionDaoSupport需要sqlsessionfactory依赖，所以需要在applicationContext里注入一下。
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
