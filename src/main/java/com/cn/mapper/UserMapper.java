package com.cn.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
public interface UserMapper extends BaseMapper<User> {

   Integer deleteById(@Param("id") String id);

   List<User> selectAll();

   @Select("select * from user where 1=1")
   List<User> findAllUsers();


}
