package com.shimh.mapper;

import com.shimh.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public User getUserById(Long id);


    @SelectKey(keyProperty = "sys_user.id",resultType = String.class, before = true,
            statement = "select replace(uuid(), '-', '')")
    @Options(keyProperty = "sys_user.id", useGeneratedKeys = true)
    @Insert("insert into sys_user(id,account,password) values(#{sys_user.id,jdbcType=VARCHAR},#{sys_user.account,jdbcType=VARCHAR},#{sys_user.password,jdbcType=VARCHAR})")
    public int add(@Param("sys_user") User sys_user);
}
