package com.expenses_tracker.ExpensesTracker.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expenses_tracker.ExpensesTracker.Model.Category;
import com.expenses_tracker.ExpensesTracker.Service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired							  //springboot itself creates it's object and inject it in controller methods
	CategoryService categoryService;
	
	@GetMapping("/category")					//for fetching or displaying
	public String addCategory(Model model) {
		model.addAttribute("message", "My first spring boot proj");    //1st argument is KEY and 2nd argument is VALUE
		List<Category> categories = categoryService.getAllCategory();
		model.addAttribute("category", categories);
		return "category";
	}
	
	//rest api 
	@GetMapping("/addCategory")
	public String addCategory() {
		Category category=new Category("Food", LocalDate.now(), LocalDate.now());
		categoryService.addCategory(category);
		return "category";
	}
	
	//method add category
}


//model is used to pass the data to the frontend or view