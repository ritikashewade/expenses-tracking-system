package com.expenses_tracker.ExpensesTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenses_tracker.ExpensesTracker.Model.Category;
import com.expenses_tracker.ExpensesTracker.Repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo repo;
	
	@Override
	public List<Category> getAllCategory() {
		List<Category> categories = repo.findAll();
		return categories;
	}

	@Override
	public Category addCategory(Category category) {
	Category cate=repo.save(category);
		return cate;
	}
	
}
