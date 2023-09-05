package com.memo2.lesson03;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateDAO {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public RealEstate selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
}
