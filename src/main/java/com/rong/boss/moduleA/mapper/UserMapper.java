package com.rong.boss.moduleA.mapper;

import com.rong.boss.moduleA.domain.User;

/**
 * Created by amoszhou on 16/3/20.
 */
public interface UserMapper {

    int createUser(User user);

    User selectById(Integer id);
}
