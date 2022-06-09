package com.shimh.service.impl;

import com.shimh.entity.User;
import com.shimh.mapper.UserMapper;
import com.shimh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceNewImpl implements IUserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        User userById = userMapper.getUserById(id);
        return userById;
    }

    @Override
    public int add(User sys_user) {
        return 0;
    }
}
