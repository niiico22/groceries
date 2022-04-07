package com.example.groceries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class GroceriesApplication {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	public static void main(String[] args) {
		SpringApplication.run(GroceriesApplication.class, args);

	}

	@Bean
  	public CommandLineRunner demo(GroceriesRepository repository) {
    		
		return args -> {
				
			Iterable<Grocery>  allGroceries = repository.findAll();
			log.info(" list all groceries : ");
			for(Grocery grocery : allGroceries) {
				log.info("  " + grocery.getName());
			}
		};
	}
}
