package com.cn.controller;


import com.cn.entity.User;
import com.cn.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@Controller
@RequestMapping("/cn/userRole")
public class UserRoleController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET,produces = {"application/json"})
    public List<User> findAll(){
        return userService.selectList(null);
    }

}

