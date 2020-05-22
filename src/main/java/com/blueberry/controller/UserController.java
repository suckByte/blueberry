package com.blueberry.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blueberry.pojo.User;
import com.blueberry.service.ITestService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private ITestService iTestService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = iTestService.getUserById(userId);
		model.addAttribute("user1", user);
		return "showUser2";
	}
}
