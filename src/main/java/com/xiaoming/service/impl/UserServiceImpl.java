package com.xiaoming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        // PageHelper 分页
        PageHelper.startPage(1, 2, true);
        List<UserInfo> list = userDao.queryUsers();
        PageInfo pageInfo = new PageInfo(list);
        // TODO 分页详细信息
        return list;
    }

}
