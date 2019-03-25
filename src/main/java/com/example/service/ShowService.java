package com.example.service;

import java.util.List;

import com.example.entry.UserLog;

public interface ShowService {
	/*
	 * 进行分页操作
	 * 数组分页：要求数据量较少
	 */
	List<UserLog> queryLogByArray(int currPage, int pageSize);
}
