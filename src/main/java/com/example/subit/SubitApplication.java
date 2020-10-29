package com.example.subit;

import com.example.subit.domain.Car;
import com.example.subit.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SubitApplication {
@Autowired
private CarRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SubitApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {

		};
}
}
