package com.ischoolbar.programmer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.ManagerDao;
import com.ischoolbar.programmer.entity.Manager;
import com.ischoolbar.programmer.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;
	
	@Override
	public Manager findByName(String name) {
		// TODO Auto-generated method stub
		return managerDao.findByName(name);
	}

}
