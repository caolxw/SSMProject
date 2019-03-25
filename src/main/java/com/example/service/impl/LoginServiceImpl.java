package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entry.User;
import com.example.entry.UserLog;
import com.example.mapper.UserLogMapper;
import com.example.mapper.UserMapper;
import com.example.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserLogMapper logMapper;
	
	@Override
	public User checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		List<User> user = userMapper.find(name, pwd);
		if (user.size() == 1) {
			logMapper.addLog(new UserLog(name, "登陆"));
			return user.get(0);
		}else {
			return null;
		}
	}

}
