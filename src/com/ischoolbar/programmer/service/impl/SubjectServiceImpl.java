package com.ischoolbar.programmer.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.SubjectDao;
import com.ischoolbar.programmer.entity.Subject;
import com.ischoolbar.programmer.service.SubjectService;
@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectDao subjectDao;
	@Override
	public int add(Subject subject) {
		// TODO Auto-generated method stub
		return subjectDao.add(subject);
	}
	@Override
	public List<Subject> findByName(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return subjectDao.findByName(map);
	}
	@Override
	public int getTotalByName(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return subjectDao.getTotalByName(map);
	}
	@Override
	public int edit(Subject subject) {
		// TODO Auto-generated method stub
		return subjectDao.edit(subject);
	}
	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return subjectDao.delete(ids);
	}
	@Override
	public List<Subject> findByRelation(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return subjectDao.findByRelation(map);
	}
	@Override
	public int addOneVote(Long id) {
		// TODO Auto-generated method stub
		return subjectDao.addOneVote(id);
	}

}
