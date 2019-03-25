package com.example.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.entry.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from user")
	public List<User> showList();
	
	@Select("select * from user where name = #{name}")
	public User findByName(@Param("name")String name);
	
	@Select("select * from user where name = #{name} and password = #{pwd}")
	public List<User> find(@Param("name")String name,@Param("pwd")String password);
	
	@Insert("insert into user values(#{id},#{name},#{password}")
	public int add(User user);
}
