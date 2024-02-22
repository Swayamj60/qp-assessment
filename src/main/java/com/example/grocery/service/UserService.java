package com.example.grocery.service;

import java.util.List;

import com.example.grocery.model.BookRequest;
import com.example.grocery.model.GroceryItem;

public interface UserService {
	
	List<GroceryItem> viewItems();

    void bookItems(List<BookRequest> bookRequests);

}
