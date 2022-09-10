package com.dongproject.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dongproject.user.dvo.UserVo;

@Mapper
public interface UserMapper {

	UserVo userInfo(UserVo vo);
	
}
