package com.memo2.user.dao;

import org.springframework.stereotype.Repository;

import com.memo2.user.entitiy.UserEntity;

@Repository
public interface UserRepository {
	public UserEntity findByLoginId(String loginId);
}
