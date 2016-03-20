package com.rong.boss.mapper;

import com.rong.boss.moduleA.domain.User;
import com.rong.boss.moduleA.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by amoszhou on 16/3/20.
 */
public class UserMapperTest extends BaseJunitTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setCreateTime(new Date());
        userMapper.createUser(user);
    }

    @Test
    public void testSelect(){
       User user = userMapper.selectById(1);
        Assert.assertEquals("admin",user.getUsername());
    }
}
