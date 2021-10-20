package com.hito.mapper;

import com.hito.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //我们的所有操作，原来都是用sqlSession执行，现在使用sqlSessionTemplate;

    private SqlSessionTemplate sqlSession;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
