package com.cn.mybatispus;

import com.cn.Application;
import com.cn.entity.User;
import com.cn.service.IUserService;
import com.cn.serviceImpl.UserServiceImpl;
import com.cn.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

	@Autowired
	private UserServiceImpl userService;
	@Test
	public void test(){
		List<User>  users =  userService.findAllUsers();
		System.out.println(users.size());
	}

}
