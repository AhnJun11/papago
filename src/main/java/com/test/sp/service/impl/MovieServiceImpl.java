package com.test.sp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.api.MovieAPI;
import com.test.sp.entity.Result;
import com.test.sp.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	 @Autowired
	 private MovieAPI ma;
	 
	@Override
	public Result getResult() {
		// TODO Auto-generated method stub
		return ma.getResult();
	}

}
