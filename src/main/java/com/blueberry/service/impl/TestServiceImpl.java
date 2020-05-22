package com.blueberry.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blueberry.dao.IUserDao;
import com.blueberry.pojo.User;
import com.blueberry.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {

	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
