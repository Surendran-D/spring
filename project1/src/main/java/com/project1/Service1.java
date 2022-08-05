package com.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;


@Service
public class Service1 {
	
	@Autowired
	Reposit1 repo;
	
	 void create(Student stu)
	{
		repo.save(stu);
	
	}
}
