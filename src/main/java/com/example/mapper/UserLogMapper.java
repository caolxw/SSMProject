package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.entry.UserLog;

@Mapper
public interface UserLogMapper {
	@Select("select * from user_log")
	public List<UserLog> showlist();
	
	@Select("select * from user_log where name=#{name}")
	public List<UserLog> showListByName(@Param("name")String name);
	
//	@Insert("insert into user_log values(#{id},#{name},#{time})")
//	public int addLog(UserLog userLog);
	
	@Insert("insert into user_log(name,time,action) values(#{name},#{time},#{action})")
	public int addLog(UserLog userLog);
}
