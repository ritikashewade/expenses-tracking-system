package com.expenses_tracker.ExpensesTracker.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expenses_tracker.ExpensesTracker.Model.Category;


public interface CategoryService {
	 List<Category> getAllCategory();
	 
	 Category addCategory(Category category);
}


