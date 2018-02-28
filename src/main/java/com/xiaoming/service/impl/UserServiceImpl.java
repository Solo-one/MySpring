package com.xiaoming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoming.bean.UserInfo;
import com.xiaoming.dao.UserMapper;
import com.xiaoming.service.UserService;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userDao;

    @Override
    public List<UserInfo> queryUsers() {
        return userDao.queryUsers();
    }

}
