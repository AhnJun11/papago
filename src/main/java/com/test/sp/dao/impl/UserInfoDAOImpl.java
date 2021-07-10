package com.test.sp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.sp.dao.UserInfoDAO;
import com.test.sp.entity.UserInfo;

@Repository
@Transactional
public class UserInfoDAOImpl implements UserInfoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<UserInfo> getUserInfoList() {
		List<UserInfo> getUserList = em.createQuery("from UserInfo ui",UserInfo.class).getResultList();
		return getUserList;
	}

}
