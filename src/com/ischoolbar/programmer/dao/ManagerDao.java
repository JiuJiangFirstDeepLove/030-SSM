package com.ischoolbar.programmer.dao;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.Manager;

@Repository
public interface ManagerDao {
	public Manager findByName(String name);
}
