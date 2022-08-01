package com.dongproject.agreement.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AgreementVo {

	private int agreementNo;
	private String agreementTitle;
	private String agreementContent;
	private Date createDate;
}
