package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.ClassDAO;
import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.ClassService;
import cn.springmvc.service.UserService;


@Service
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassDAO classDAO;
	

	public List getClass(String id) {
		// TODO Auto-generated method stub
		return classDAO.getClass(id);
	}
	
	public List getClass2(String id) {
		// TODO Auto-generated method stub
		return classDAO.getClass2(id);
	}
	
	public List getClass4(String id) {
		// TODO Auto-generated method stub
		return classDAO.getClass4(id);
	}

}
