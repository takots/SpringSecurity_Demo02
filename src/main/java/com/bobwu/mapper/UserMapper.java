package com.bobwu.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bobwu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 在 MyBatis 中，如果你使用的是 Spring Boot 并且已经配置了 @MapperScan 注解，
 * 那么 UserMapper 接口上不需要单独加 @Mapper 注解。
 */
//@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM user WHERE name = #{name}")
    List<User> findByName(@Param("name")String name);

    @Select("SELECT * FROM user WHERE age BETWEEN #{minAge} AND #{maxAge}")
    List<User> findByAgeRange(@Param("minAge") int minAge, @Param("maxAge") int maxAge);

    @Select("SELECT * FROM user WHERE name LIKE #{nameLike}")
    List<User> findByNameLike(@Param("nameLike") String nameLike);
}