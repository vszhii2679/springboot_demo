package com.itheima.test;

import com.itheima.domain.Person;
import com.itheima.domain.UserInfo;
import com.itheima.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserDao userDao;

    @Autowired
    private Person person;

    @Test
    public void insert(){
        UserInfo userInfo = new UserInfo(null,"mayun",40);
        userDao.add(userInfo);
    }

    @Test
    public void findAll(){
        List<UserInfo> list = userDao.findAll();
        System.out.println("list = " + list);
    }

    @Test
    public void testInitPerson(){
        System.out.println(person);
    }
}
