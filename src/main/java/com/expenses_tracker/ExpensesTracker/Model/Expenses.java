package com.expenses_tracker.ExpensesTracker.Model;

import java.time.LocalDate;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="expenses")
public class Expenses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  
    private String description; 
    private Double amount; 
    private LocalDate date; 
    private LocalDate createdAt; 
    private LocalDate updatedAt; 
    @ManyToOne
    @JoinColumn
    private Category category;
    @ManyToOne
    @JoinColumn
    private User user;
	public Expenses(String description, Double amount, LocalDate date, LocalDate createdAt, LocalDate updatedAt,
			Category category, User user) {
		super();
		this.description = description;
		this.amount = amount;
		this.date = date;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.category = category;
		this.user = user;
	}
	public Expenses() {
		super();
	}
    
}
