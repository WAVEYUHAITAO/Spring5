package com.hito.mapper;

import com.hito.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//继承sqlSessionDaoSupport,可以帮助我们创建sqlsessiontemplate，这种方式下，spring-dao离的sqlsession可以省略。
//但是由于SqlSessionDaoSupport需要sqlsessionfactory依赖，所以需要在applicationContext里注入一下。
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public List<User> selectUser() {
        User user = new User(8,"小王","233333");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        //这里虽然sql写错了但是依然插入成功，不符合我们对事务acid原则的要求
        mapper.addUser(user);
        mapper.deleteUser(7);

        return mapper.selectUser();

    }
}
