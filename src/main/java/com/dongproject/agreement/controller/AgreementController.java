package com.dongproject.agreement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dongproject.agreement.service.AgreementService;
import com.dongproject.agreement.vo.AgreementVo;

@RestController
@RequestMapping("/api/v1/agreement")
public class AgreementController {

	@Autowired
	AgreementService service;	
	
	@RequestMapping("/info")
	public ResponseEntity<List<AgreementVo>> selectAgreementInfo() {
		
		List<AgreementVo> list = service.selectAgreementInfo();
		return new ResponseEntity<List<AgreementVo>>(list,HttpStatus.OK);
	}
}
