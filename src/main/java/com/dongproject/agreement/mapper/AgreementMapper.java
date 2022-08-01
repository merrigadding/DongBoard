package com.dongproject.agreement.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dongproject.agreement.vo.AgreementVo;

@Mapper
public interface AgreementMapper {

	public List<AgreementVo> selectAgreementInfo();

}
