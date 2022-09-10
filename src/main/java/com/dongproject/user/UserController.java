package com.dongproject.user;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dongproject.common.dvo.StatusEnum;
import com.dongproject.common.dvo.StatusObj;
import com.dongproject.user.dvo.UserVo;
import com.dongproject.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/test")
@Slf4j
public class UserController {

	@Autowired
	UserService service;
	
	
	@RequestMapping(value = "/login",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<StatusObj> login(
				HttpServletRequest request,
				HttpServletResponse response,
				@RequestParam(required = false) String userId,
				@RequestParam(required = false) String userPw
			) { 
		UserVo vo = new UserVo();
		vo.setUserId(userId);
		vo.setUserPassword(userPw);
		UserVo userVo= service.userInfo(vo);
		if(userVo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", userVo);
			log.info("user 정보 : {}", session.getAttribute("userInfo").toString());
		}
		
		StatusObj sto = new StatusObj();
		sto.setData(userVo);
		sto.setStatus(StatusEnum.BAD_REQUEST);
		sto.setMessage("성공코드");
		return new ResponseEntity<>(sto, HttpStatus.OK); 
	}

	@RequestMapping(value = "/logout" )
	public ResponseEntity<StatusObj> logout(HttpServletRequest request) {
		StatusObj status = new StatusObj();
		HttpSession session = request.getSession(false);
		if(session != null) {
			log.info("session : {}",session.getAttribute("userInfo"));
			session.invalidate();
			status.setMessage("로그아웃이 완료되었습니다.");
		}
		return new ResponseEntity<StatusObj>(status, HttpStatus.OK);
	}
}
