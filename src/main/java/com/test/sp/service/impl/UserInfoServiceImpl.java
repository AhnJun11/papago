package com.test.sp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.UserInfoDAO;
import com.test.sp.entity.UserInfo;
import com.test.sp.service.UserInfoService;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDAO ud;

	@Override
	public List<UserInfo> getUserInfoList() {
		return ud.getUserInfoList();
	}

}
