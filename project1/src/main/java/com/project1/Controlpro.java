package com.project1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class  Controlpro
{
    @Autowired
	Reposit1 repo12;
	
	@RequestMapping("home")
	public ModelAndView display()
	{
		ModelAndView mv=new ModelAndView("homepage");
		List<Student> Lst=repo12.findAll();
		mv.addObject("students", Lst);
		return mv;
	      	
	}
	
	@RequestMapping("create")
	public String  create(Student stud)
	{
	repo12.save(stud);
	return "create";	
	}
	
	@GetMapping("getstudent")
	public ModelAndView getstud(@RequestParam int id)    
	{
		ModelAndView mv1=new ModelAndView("read");
        Student st1=repo12.findById(id).orElse(null);
        mv1.addObject("student", st1);
       return mv1;
	
	}
	
	@GetMapping("delete")
	public ModelAndView deletestud(@RequestParam int id)   
	{
		ModelAndView mv1=new ModelAndView("delete");
        repo12.deleteById(id);
        
       return mv1;
	
	}
	@RequestMapping("update")
	public ModelAndView updatestud( Student stu)   
	{
		ModelAndView mv1=new ModelAndView("update");
        repo12.save(stu);
        
        
        
        
    return mv1;
	
	}
	
	
}