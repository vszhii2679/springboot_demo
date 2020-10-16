package com.itheima.mapper;

import com.itheima.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into user(name,age) values(#{name},#{age})")
    void add(UserInfo userInfo);

    @Select("select * from user")
    List<UserInfo> findAll();
}
