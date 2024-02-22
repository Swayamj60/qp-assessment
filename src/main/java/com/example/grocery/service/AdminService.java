package com.example.grocery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.grocery.model.GroceryItem;
import com.example.grocery.model.InventoryRequest;

@Service
public interface AdminService {

	void addGroceryItem(GroceryItem groceryItem);

    List<GroceryItem> viewItems();

    void removeGroceryItem(Long itemId);

    void updateGroceryItem(GroceryItem groceryItem);

    void manageInventory(InventoryRequest request);
}