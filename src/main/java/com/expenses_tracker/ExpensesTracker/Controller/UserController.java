package com.expenses_tracker.ExpensesTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.expenses_tracker.ExpensesTracker.Model.User;
import com.expenses_tracker.ExpensesTracker.Repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user){
		repo.save(user);
	}
}
