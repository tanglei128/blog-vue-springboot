package com.shimh.service;

import com.shimh.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    public User getUserById(Long id);
    public int add(@Param("sys_user") User sys_user);
}
