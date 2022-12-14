package com.example.RestAPI;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

	@Autowired
	private EmpRepository empRepository;
	
	@GetMapping("/allemployee")
	public List < Employee > getAllEmployees() {
				return empRepository.findAll();
//			return (HttpStatus.OK);
	}
	
    @GetMapping("/employee/{id}")
    public Optional<Employee> show(@PathVariable int id){
        return empRepository.findById(id);
    }
    
//	@PostMapping("/postdata")
//	public ResponseEntity<Employee> createTutorial(@RequestBody Employee employee) {
//			Employee employee = empRepository
//					.save(new Employee(employee.getname(), employee.getcity()));
//			return new ResponseEntity<>(employee, HttpStatus.CREATED);
//	}
	
    @PostMapping("/postdata")
    public Employee create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        String city = body.get("city");
        return empRepository.save(new Employee(name,city));
    }
    
}
