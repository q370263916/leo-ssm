package cn.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired UserServiceImpl userServiceImpl;
        
	@RequestMapping("/add")
	public String index(){
		User user=new User();
		user.setCreate_time(new Date(0));
		user.setDevice_num("123");
		user.setLast_time(new Date(0));
		user.setState(1);
		user.setNickname("老司机");
		user.setDevice_type(1);
		userServiceImpl.insertUser(user);
		System.out.println("添加成功！");
		return "index1";
	}
	
  @RequestMapping("/getUserList")
  public List getUserList(){
		List  list=userServiceImpl.queryAllStudents();
//	    for (User user : list) {
//			System.out.println(user.getNickname()+"------------");
//		}
		return list;
	}
	  
  }

	
	
	
