package com.zhxl.springboot.service;

import com.zhxl.springboot.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /*查所有*/
    List<User> findAll();
    /*根据ID查询*/
    User getUserByUsername(String username);
    /*增加*/
    void insertUser(User user);
    /*修改*/
    void updateUser(User user);
    /*删除*/
    void deleteUser(User user);
}
