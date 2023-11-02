package com.ischoolbar.programmer.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.Subject;
import com.ischoolbar.programmer.entity.SubjectItem;

@Service
public interface SubjectItemService {
	public int add(SubjectItem subjectItem);
	public List<SubjectItem> findByName(Map<String, Object> map);
	public int getTotalByName(Map<String, Object> map);
	public int edit(SubjectItem subjectItem);
	public int delete(String ids);
	public int addOneVote(Long id);
}
