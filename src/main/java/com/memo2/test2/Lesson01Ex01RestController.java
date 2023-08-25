package com.memo2.test2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController
public class Lesson01Ex01RestController {
	
	@RequestMapping("/3")
	public String printString() {
		return "@RestController 를 사용해 String을 리턴해본다.";
	}
	
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data();
		data.setId(1);
		data.setName("박재현");
		
		return data;
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> entity() {
		Data data = new Data(); // 일반 자바 bean
		data.setId(1);
		data.setName("신보람");
		
		// 크롬 > Network tab 응답값 확인!
		//return new ResponseEntity<>(data, HttpStatus.OK); // 200 ok
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // 500 error
	}
	
}
