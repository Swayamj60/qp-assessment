package com.example.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.model.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem ,Long> {

}
