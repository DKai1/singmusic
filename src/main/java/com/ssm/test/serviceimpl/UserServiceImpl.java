package com.ssm.test.serviceimpl;


import com.ssm.test.dao.UserMapper;
import com.ssm.test.model.User;
import com.ssm.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
