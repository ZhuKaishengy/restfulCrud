package com.aisino.test;

import java.util.List;

import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aisino.restfulcrud.domain.User;

public class DaoTest {

	private  ApplicationContext applicationContext ;
	private  SqlSessionTemplate sessionTemplate;
	
	public SqlSessionTemplate getSessionTemplate() {
		return sessionTemplate;
	}

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	{
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		sessionTemplate = (SqlSessionTemplate) applicationContext.getBean("sessionTemplate");
	}
	
	@Test
	public void testDao(){
		List<User> users = sessionTemplate.selectList("com.aisino.restfulcrud.dao.UserMapper.selectAllUsers");
		System.out.println(users);
	}
	
}
