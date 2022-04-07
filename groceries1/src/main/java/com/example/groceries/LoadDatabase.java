
package com.example.groceries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(GroceriesRepository repository) {

    return args -> {
      log.info("insert list rice " + repository.save(new Grocery("rice beans flour")));
      log.info("insert list tomatoes " + repository.save(new Grocery("tomatoes spinach bread")));
      
    };
  }
}