package com.task1.painationExample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	List<User> getAll(){
		return userRepo.findAll();
	}
	
//	void save() {
//		userRepo.save(new User(500001,"Kamal", "kamal", "kamal", "lakjkl", 1));
//	}
}
