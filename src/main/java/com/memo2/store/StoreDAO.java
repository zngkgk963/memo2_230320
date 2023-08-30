package com.memo2.store;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO {
	
	public List<Store> selectStoreList();
}
