package com.cn.service;

import com.baomidou.mybatisplus.service.IService;
import com.cn.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
public interface IUserService extends IService<User> {

    User findById(String id);

    List<User> getUseOrderById();

    List<User> getUserByCredict(Integer currentPage, Integer pageSize);

    List<User> findAllUsers();

    void delById(String id);

}
