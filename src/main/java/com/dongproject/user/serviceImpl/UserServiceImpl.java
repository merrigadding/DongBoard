package com.dongproject.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongproject.user.dvo.UserVo;
import com.dongproject.user.mapper.UserMapper;
import com.dongproject.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public UserVo userInfo(UserVo vo) {
		// TODO Auto-generated method stub
		return mapper.userInfo(vo);
	}

}
