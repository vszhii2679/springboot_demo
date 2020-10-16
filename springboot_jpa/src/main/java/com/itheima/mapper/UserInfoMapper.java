package com.itheima.mapper;

import com.itheima.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserInfoMapper extends JpaRepository<UserInfo,Integer> {
}
