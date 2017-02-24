package cn.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.impl.ClassServiceImpl;
import cn.springmvc.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired ClassServiceImpl classServiceImpl;
        
 
	
	@RequestMapping("/getClassVo")
	public String getClassVo(){
		
		List l=classServiceImpl.getClass("1");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i)+"=============");
		}
		return "index1";
	 
	}
	
	@RequestMapping("/getClassVo2")
	public String getClassVo2(){
		
		List l=classServiceImpl.getClass2("1");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i)+"------------");
		}
		return "index1";
	 
	}
	@RequestMapping("/getClassVo4")
	public String getClassVo4(){
		
		List l=classServiceImpl.getClass4("1");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i)+"------------");
		}
		return "index1";
	 
	}
	
	
}
