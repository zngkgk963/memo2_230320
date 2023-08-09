package com.memo2.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class PostController {
	
//	@Autowired
//	private PostBO postBO;
	
	@GetMapping("/post_list_view")
	public String postListView(Model model) {
		model.addAttribute("view", "post/postList");
		return "template/layout";
	}
	
}
