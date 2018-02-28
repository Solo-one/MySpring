package com.xiaoming.bean;

import java.io.Serializable;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
public class UserInfo implements Serializable {

    private String userId;
    private String userName;
    private String userPwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
