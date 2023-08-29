package com.memo2.store;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StoreDAO {
	
	public List<Store> selectStoreList();
}
