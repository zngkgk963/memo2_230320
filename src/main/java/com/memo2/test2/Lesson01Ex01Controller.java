package com.memo2.test2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")  // 메소드에 붙은 mapping보다 먼저 적용
@Controller
public class Lesson01Ex01Controller {
	@ResponseBody 			   // 리턴되는 값을 HTML Response로 보낸다.
	@RequestMapping("/1")   // 주소 매핑
	public String printString() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}
	
	
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 4);
		map.put("banana", 10);
		map.put("soccer", 3);
		map.put("melon", 5);
		
		return map;
	}
	
	
}
