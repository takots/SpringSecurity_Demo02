package com.bobwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bobwu.entity.User;
import com.bobwu.mapper.UserMapper;
import com.bobwu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsersByName(String name) {
        return userMapper.findByName(name);
    }

    public List<User> getUsersByAgeRange(int minAge, int maxAge) {
        return userMapper.findByAgeRange(minAge, maxAge);
    }

    public List<User> getUsersByNameLike(String nameLike) {
        return userMapper.findByNameLike(nameLike);
    }
}