package com.example.RestAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository <Employee, Integer> {
	

}
