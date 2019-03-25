package com.example.service;

import com.example.entry.User;

public interface LoginService {
	/*
	 * 检查用户登录信息
	 */
	public User checkLogin(String name,String pwd);
}
