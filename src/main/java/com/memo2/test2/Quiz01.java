package com.memo2.test2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/quiz01")
public class Quiz01 {
	
	@ResponseBody
	@RequestMapping("/1")
	public String quiz01_1() {
		return "<h1>테스트 프로젝트 완성</h1><h3>해당 프로젝트를 통해서 문제 풀이를 진행 합니다</h3>";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<Object, Integer> quiz01_2() {
		Map<Object, Integer> result = new HashMap<>();
		result.put("국어", 80);
		result.put("수학", 90);
		result.put("영어", 85);
		
		return result;
	}
	
	
}
