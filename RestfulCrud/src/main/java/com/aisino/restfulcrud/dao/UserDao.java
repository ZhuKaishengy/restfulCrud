package com.aisino.restfulcrud.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.aisino.restfulcrud.domain.User;

@Repository
public class UserDao implements UserMapper {
	Map<Integer, User> map = null;
	{
		User u1 = new User(1, "zks", "123");
		User u2 = new User(2, "sjx", "456");
		User u3 = new User(3, "rl", "789");
		map = new HashMap<Integer, User>();
		map.put(u1.getId(), u1);
		map.put(u2.getId(), u2);
		map.put(u3.getId(), u3);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		
		// TODO Auto-generated method stub
		for (int key : map.keySet()) {
			User user = map.get(key);
			users.add(user);
		}
		return users;
	}

}
