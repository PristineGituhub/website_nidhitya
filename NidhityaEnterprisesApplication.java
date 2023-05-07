package com.ankur.nidhitya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class}) 
public class NidhityaEnterprisesApplication { 

	public static void main(String[] args) {
		SpringApplication.run(NidhityaEnterprisesApplication.class, args);
		System.out.println("Nidhitya is live");
	}

}
