package com.rong.boss.moduleA.service;

import com.rong.boss.moduleA.domain.User;
import com.rong.boss.moduleA.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by amoszhou on 16/3/20.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User queryUser(Integer id){
        return userMapper.selectById(id);
    }
}
