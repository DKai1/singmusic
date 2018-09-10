package com.ssm.test.test;


import com.ssm.test.dao.UserMapper;
import com.ssm.test.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
            public  void   test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper =(UserMapper) context.getBean("userMapper");
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        System.out.println(user.getUsername());
            }
}
