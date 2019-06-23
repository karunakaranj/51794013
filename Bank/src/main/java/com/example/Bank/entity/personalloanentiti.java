package com.example.Bank.entity;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	
	@Entity
	
	@Table(name = "PERSONAL LOAN DETAILS")
	
	public class personalloanentiti {
		
		private String Name;
		private String Gender;
		private String DOB;
		private String mobile;
		private String Maritalstatus;
		private String CreditScore;
		private String  salary;
		private String Expense;
		
	}
}
