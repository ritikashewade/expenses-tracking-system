package com.expenses_tracker.ExpensesTracker.Model;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fullname;
	private String email;
	private String password;
	private String role;
	@OneToMany(mappedBy = "user")
	private List<Expenses> expenses;
	public User(String fullname, String email, String password, String role, List<Expenses> expenses) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.role = role;
		this.expenses = expenses;
	}
	public User() {
		super();
	}


	

	
	
}
