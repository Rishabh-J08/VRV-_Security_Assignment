package com.vrvsecurityAssignment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class VrvsecurityAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(VrvsecurityAssignmentApplication.class, args);
	}

}
