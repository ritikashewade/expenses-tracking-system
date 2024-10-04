package com.expenses_tracker.ExpensesTracker.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="category")
public class Category {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; 
	    private String name; 
	    private LocalDate createdAt; 
	    private LocalDate updatedAt;
	    @OneToMany(mappedBy = "category")
	    private List<Expenses> expenses;
	    
		public Category(String name, LocalDate createdAt, LocalDate updatedAt) {
			super();
			this.name = name;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}

		public Category() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDate createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDate getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDate updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Expenses> getExpenses() {
			return expenses;
		}

		public void setExpenses(List<Expenses> expenses) {
			this.expenses = expenses;
		} 
		
		
	    
}
