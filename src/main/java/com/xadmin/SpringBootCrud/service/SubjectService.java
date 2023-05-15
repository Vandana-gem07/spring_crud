package com.xadmin.SpringBootCrud.service;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects()  //method
	{
		
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public void addSubject(Subject subject)
	{
		subjectRepo.save(subject);
	}

	public void updateSubject(String id,Subject subject)
	{
		subjectRepo.save(subject);
	}
	
	public void deleteSubject(String id)
	{
		subjectRepo.deleteById(id);
	}
}
