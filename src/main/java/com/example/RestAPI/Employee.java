package com.example.RestAPI;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
    @Column(name="name")
	private String name;
    @Column(name="city")
	private String city;
	
    public Employee() {  }

    public Employee(String name, String city) {
        this.setName(name);
        this.setCity(city);
    }

    public Employee(int id, String name, String city) {
        this.setEmp_id(emp_id);
        this.setName(name);
        this.setCity(city);
    }

	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
