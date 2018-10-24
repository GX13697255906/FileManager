package com.cn.controller;


import com.cn.entity.User;
import com.cn.service.IUserService;
import com.cn.util.LogHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/get/id/{id}",method = RequestMethod.GET)
    public User getById(@PathVariable("id") String id){
        System.out.println("-----------------------getById---------------------------");
        LogHelper.log(new UserController());
        System.out.println("-----------------------getById---------------------------");
        return userService.selectById(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        System.out.println("-----------------------addUser---------------------------");
        return userService.insert(user);
    }

    @RequestMapping(value = "/alls")
    public List<User> findAllUser(){
        System.out.println("-----------------findAllUser-----------------------------");
        LogHelper.log(new UserController());
        System.out.println("-----------------findAllUser-----------------------------");
        return userService.findAllUsers();
    }






    @RequestMapping(value = "/del/{id}")
    public void delById(@PathVariable("id") String id){
        System.out.println("id = "+id);
        userService.delById(id);
    }


    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public List<User> orderById(){
        return userService.getUseOrderById();
    }


    @RequestMapping(value = "/all")
    public List<User> findAll(){
        return userService.selectList(null);
    }

    @RequestMapping(value = "/page/{currentPage}/{pageSize}")
    public List<User> page(@PathVariable("currentPage") Integer currentPage,@PathVariable("pageSize") Integer pageSize){
        return userService.getUserByCredict(currentPage,pageSize);
    }


}

