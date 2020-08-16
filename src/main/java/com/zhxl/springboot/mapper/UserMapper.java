package com.zhxl.springboot.mapper;

import com.zhxl.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> findAll();
    User getUserByUsername(String username);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
