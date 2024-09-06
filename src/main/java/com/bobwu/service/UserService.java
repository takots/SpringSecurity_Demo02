package com.bobwu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bobwu.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    public List<User> getUsersByName(String name);

    public List<User> getUsersByAgeRange(int minAge, int maxAge);

    public List<User> getUsersByNameLike(String nameLike);

}