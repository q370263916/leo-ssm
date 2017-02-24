package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.User;
import cn.springmvc.model.UserVo;


public interface UserDAO {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	public List<UserVo> queryAllStudents();
}
