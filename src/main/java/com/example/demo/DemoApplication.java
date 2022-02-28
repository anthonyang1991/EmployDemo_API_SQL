package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{//execute the various types of code that only have to be run once, right after application startup.
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {

		//Employee employee = new Employee();
	//	employee.setFirstName("Anthony");
		///employee.setLastName("Ang");
		//employee.setEmailId("anthonyang1991@hotmail.com");
		//employeeRepository.save(employee);

		//Employee employee1 = new Employee();
		//employee1.setFirstName("Ru");
		//employee1.setLastName("Chin");
		//employee1.setEmailId("Ruchin@hotmail.com");
		//employeeRepository.save(employee1);


	}
}
