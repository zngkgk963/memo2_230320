package com.memo2.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstateById(int id) {
		return realEstateDAO.selectRealEstate(id);
	}
	
	public RealEstate getRealEstateByRentPrice(int rentPrice) {
		return realEstateDAO.selectRealEstateByRentPrice(rentPrice);
	}
}
