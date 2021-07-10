package com.test.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.UserInfo;
import com.test.sp.service.UserInfoService;

import jdk.internal.org.jline.utils.Log;

@Controller
public class UserInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
	
	@Autowired
	private UserInfoService us;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public @ResponseBody List<UserInfo> getUserInfoList(){
			Log.info("info List=>{}", us.getUserInfoList());
			Log.debug("debug List=>{}", us.getUserInfoList());
		return us.getUserInfoList();
	}

}
