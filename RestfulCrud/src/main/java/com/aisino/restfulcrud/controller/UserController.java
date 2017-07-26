package com.aisino.restfulcrud.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aisino.restfulcrud.dao.UserDao;
import com.aisino.restfulcrud.domain.User;

@Controller
public class UserController {
	
	@Autowired()
	UserDao userDao;
	
	@RequestMapping("/user")
	public String list(){
		List<User> users = userDao.getAllUsers();
		System.out.println(users);
		return "index";
	}
	
}
