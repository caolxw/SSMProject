package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entry.User;
import com.example.service.LoginService;
import com.example.service.ShowService;

@Controller

public class LoginController {
	private static int index = 1;
	@Autowired
	LoginService loginService;
	@Autowired
	ShowService showService;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String check(Model model ,User u) {
		u = loginService.checkLogin(u.getName(), u.getPassword());
		if(u == null) {
			return "login";
		}
		else {
			model.addAttribute("user", u);
			index = 1;
			model.addAttribute("logs", showService.queryLogByArray(index, 10));
			return "main";
		}
	}
	
	@PostMapping("/next")
	public String nextIndex(Model model) {
		index ++;
		model.addAttribute("logs",showService.queryLogByArray(index, 10));
		return "main";
	}
	@PostMapping("/pre")
	public String preIndex(Model model) {
		index --;
		model.addAttribute("logs",showService.queryLogByArray(index, 10));
		return "main";
	}
}
