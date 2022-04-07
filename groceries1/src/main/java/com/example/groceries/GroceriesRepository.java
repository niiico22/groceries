package com.example.groceries;

import org.springframework.data.repository.CrudRepository;


interface GroceriesRepository extends CrudRepository<Grocery, Integer> {

}