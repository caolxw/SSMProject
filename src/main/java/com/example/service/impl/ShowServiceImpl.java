package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entry.UserLog;
import com.example.mapper.UserLogMapper;
import com.example.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService {
	
	@Autowired
	UserLogMapper logMapper;
	
	@Override
	public List<UserLog> queryLogByArray(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		List<UserLog> logs = logMapper.showlist();
		int firstIndex = (currPage - 1) * pageSize;
		
		int lastIndex = currPage * pageSize;
		if (lastIndex > logs.size()) {
			lastIndex = logs.size();
		}
		
		return logs.subList(firstIndex, lastIndex);
	}

}
