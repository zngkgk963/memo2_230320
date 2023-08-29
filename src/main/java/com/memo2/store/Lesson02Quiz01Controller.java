package com.memo2.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lesson02Quiz01Controller {
	
	@Autowired
	private StoreBO storeBO;
	
	@RequestMapping("/lesson02/quiz01")
	@ResponseBody
	public List<Store> quiz01() {
		List<Store> storeList = storeBO.getStoreList();
	}
}
