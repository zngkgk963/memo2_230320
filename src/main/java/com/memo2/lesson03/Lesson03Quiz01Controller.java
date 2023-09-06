package com.memo2.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01Controller {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/1")
	public RealEstate quiz01_1(
			@RequestParam(value="id", defaultValue="1") int id) {
		System.out.println("### id : " + id);
		return realEstateBO.getRealEstateById(id);
	}
	
	@RequestMapping("/2")
	public RealEstate quiz01_2(
			@RequestParam(value="rent_price") int rentPrice) {
		return realEstateBO.getRealEstateByRentPrice(rentPrice);
	}
	
	
}
