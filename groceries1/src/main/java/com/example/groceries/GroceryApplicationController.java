package com.example.groceries;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
class GroceryApplicationController {

  private final GroceriesRepository repository;

  GroceryApplicationController(GroceriesRepository repository) {
    this.repository = repository;
  }

  @GetMapping(path="/all")
	public @ResponseBody Iterable<Grocery> getAllGroceries() {
		// This returns a JSON or XML with the groceries
		return repository.findAll();
	}

  @PostMapping("/add")
  Grocery newGrocery(@RequestBody Grocery grocery) {
    return repository.save(grocery);
  }

}