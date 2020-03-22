package com.scaffold.sample.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scaffold.sample.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<User> {
    List<User> getAllUser();
    User getUserById(@Param("id") Integer id);
}
