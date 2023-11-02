package com.ischoolbar.programmer.service;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.Manager;

@Repository
public interface ManagerService {
	public Manager findByName(String name);
}
