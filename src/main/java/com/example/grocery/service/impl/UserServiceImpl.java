package com.example.grocery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.model.BookRequest;
import com.example.grocery.model.GroceryItem;
import com.example.grocery.repo.GroceryItemRepo;
import com.example.grocery.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private GroceryItemRepo groceryItemRepository;

	@Override
    public List<GroceryItem> viewItems() {
        return groceryItemRepository.findAll();
    }

    @Override
    public void bookItems(List<BookRequest> bookRequests) {
        // Implement booking logic here
    }	

}
