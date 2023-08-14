package com.example.university;

import com.example.university.entities.Product;
import com.example.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UniversityApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

}
