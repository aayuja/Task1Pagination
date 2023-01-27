package com.task1.painationExample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("all")
	List<User> getAll(){
		
		return userService.getAll();
	}
	
	@GetMapping("save")
	String save(){
//		userService.save();
		return "Success";
	}
}
