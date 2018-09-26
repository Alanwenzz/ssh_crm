package com.zw.crm.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zw.crm.user.dao.UserDAO;
import com.zw.crm.user.pojo.User;
@Component
public class UserService {
	@Resource
	private UserDAO userDAO;
	@Transactional
	public void add(User user) {
		userDAO.add(user);
	}
}
