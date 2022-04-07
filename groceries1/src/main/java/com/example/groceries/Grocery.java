package com.example.groceries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Grocery {

  private @Id @GeneratedValue Integer id;
  private String name;

  Grocery() {}
  
  Grocery(String name) {
    this.name = name;
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Grocery{" + "id=" + this.id + ", name='" + this.name  + '}';
  }
}