package com.ischoolbar.programmer.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.SubjectDao;
import com.ischoolbar.programmer.dao.SubjectItemDao;
import com.ischoolbar.programmer.entity.Subject;
import com.ischoolbar.programmer.entity.SubjectItem;
import com.ischoolbar.programmer.service.SubjectItemService;
import com.ischoolbar.programmer.service.SubjectService;
@Service
public class SubjectItemServiceImpl implements SubjectItemService{

	@Autowired
	private SubjectItemDao subjectItemDao;
	@Override
	public int add(SubjectItem subjectItem) {
		// TODO Auto-generated method stub
		return subjectItemDao.add(subjectItem);
	}
	@Override
	public List<SubjectItem> findByName(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return subjectItemDao.findByName(map);
	}
	@Override
	public int getTotalByName(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return subjectItemDao.getTotalByName(map);
	}
	@Override
	public int edit(SubjectItem subjectItem) {
		// TODO Auto-generated method stub
		return subjectItemDao.edit(subjectItem);
	}
	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return subjectItemDao.delete(ids);
	}
	@Override
	public int addOneVote(Long id) {
		// TODO Auto-generated method stub
		return subjectItemDao.addOneVote(id);
	}

}
