package com.dongproject.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dongproject.user.dvo.UserVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/test")
@Slf4j
public class UserController {


	@RequestMapping(value = "/login",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<UserVo> login(
				@RequestParam(required = false) String userId,
				@RequestParam(required = false) String userPw
			) { 
		UserVo vo = new UserVo();
		vo.setUserId(userId);
		vo.setUserPw(userPw);
		log.debug("====== 로그인 정보 =====");
		return new ResponseEntity<UserVo>(vo, HttpStatus.OK); 
	}
	
}
