package com.expenses_tracker.ExpensesTracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenses_tracker.ExpensesTracker.Model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>{

}
