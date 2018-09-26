package com.zw.crm.user.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.zw.crm.user.pojo.User;
import com.zw.crm.user.service.UserService;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private UserService userServcie;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String login() {
		userServcie.add(user);
		return "success";
	}
}
