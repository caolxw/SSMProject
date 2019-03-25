package com.example.entry;

import java.sql.Timestamp;
import java.util.Date;

public class UserLog {
	private int l_id;
	private String name;
	private Timestamp time;
	private String action;
	
	public UserLog() {}
	public UserLog(String name,String action) {
		super();
		this.name = name;
		this.action = action;
		time = new Timestamp(new Date().getTime());
	}
	
	
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
	
	
}
