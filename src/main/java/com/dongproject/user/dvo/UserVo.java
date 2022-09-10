package com.dongproject.user.dvo;

import java.util.Date;

import com.dongproject.common.dvo.BaseDvo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVo extends BaseDvo{

	private String userId;
	private String userPassword;
	private String userAddress;
	private String userPhone;
	private String userSex;
	private Date createDate;
}
