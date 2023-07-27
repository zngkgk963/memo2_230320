package com.memo2.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memo2.post.dao.PostMapper;

@Controller
public class TestController {
	
	@Autowired PostMapper postMapper;
	
	@RequestMapping("/test1")
	@ResponseBody
	public String test1() {
		return "Hello world";
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public Map<String, Object> test2() {
		Map<String, Object> map = new HashMap<>();
		map.put("a", 111);
		map.put("b", 222);
		map.put("c", 333);
		return map;
	}
	
	@RequestMapping("/test3")
	public String test3() {
		return "test/test3";
	}
	
	@RequestMapping("/test4")
	@ResponseBody
	public List<Map<String, Object>> test4() {
		return postMapper.selectPostList();
	}
}
