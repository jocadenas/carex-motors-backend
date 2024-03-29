package com.backend.carexmotors;

import com.backend.carexmotors.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class CarexMotorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarexMotorsApplication.class, args);
	}

}
