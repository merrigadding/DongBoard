package com.dongproject.agreement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongproject.agreement.mapper.AgreementMapper;
import com.dongproject.agreement.service.AgreementService;
import com.dongproject.agreement.vo.AgreementVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AgreementServiceImpl implements AgreementService {

	@Autowired
	AgreementMapper mapper;
	
	@Override
	public List<AgreementVo> selectAgreementInfo() {
		// TODO Auto-generated method stub
		List<AgreementVo> vo = mapper.selectAgreementInfo();
		return vo;
	}

}
