package com.itheima;

import com.itheima.mapper.UserInfoMapper;
import com.itheima.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void findAll(){
        List<UserInfo> userList = userInfoMapper.findAll();
        System.out.println("userList = " + userList);
    }

    @Test
    public void save(){
        UserInfo userInfo =new UserInfo(null,"kiki",22);
        userInfoMapper.save(userInfo);
    }

    @Test
    public void pageRequest(){
        PageRequest page = PageRequest.of(0, 2);
        Page<UserInfo> pages = userInfoMapper.findAll(page);
        pages.get().forEach(System.out::println);
    }

    @Test
    public void deleteById(){
        userInfoMapper.deleteById(1);
    }

    @Test
    public void selectOne(){
        //第一种方式：使用getOne获取
        //使用getOne 要在实体类上添加@Proxy(lazy = false) 关闭延迟加载
        UserInfo userInfo = userInfoMapper.getOne(3);
        System.out.println("userInfo = " + userInfo);
        //第二种方式：使用findById获取
        Optional<UserInfo> userInfoByFind = userInfoMapper.findById(2);
        UserInfo userInfo1 = userInfoByFind.get();
        System.out.println("userInfo1 = " + userInfo1);
    }

}
