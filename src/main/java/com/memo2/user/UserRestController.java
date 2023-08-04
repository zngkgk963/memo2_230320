package com.memo2.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.memo2.user.bo.UserBO;
import com.memo2.user.entitiy.UserEntity;

@RequestMapping("/user")
@RestController
public class UserRestController {
	
	
	@Autowired
	private UserBO userBO;
	
	@RequestMapping("/is_duplicated_id")
	public Map<String, Object> isDuplicatedId(
			@RequestParam("loginId") String loginId) {
			
		Map<String, Object> result = new HashMap<>();
		result.put("isDuplicatedId", false);
		
		UserEntity userEntity = userBO.getUserEntityByLoginId(loginId);
		result.put("code", 1);
		
		
	}
	
}
