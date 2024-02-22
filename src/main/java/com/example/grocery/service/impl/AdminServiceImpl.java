package com.example.grocery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.model.GroceryItem;
import com.example.grocery.model.InventoryRequest;
import com.example.grocery.repo.GroceryItemRepo;
import com.example.grocery.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
    private GroceryItemRepo groceryItemRepository;

	@Override
    public void addGroceryItem(GroceryItem groceryItem) {
        groceryItemRepository.save(groceryItem);
    }

    @Override
    public List<GroceryItem> viewItems() {
        return groceryItemRepository.findAll();
    }

    @Override
    public void removeGroceryItem(Long itemId) {
        groceryItemRepository.deleteById(itemId);
    }

    @Override
    public void updateGroceryItem(GroceryItem groceryItem) {
        groceryItemRepository.save(groceryItem);
    }

    @Override
    public void manageInventory(InventoryRequest request) {
        // Implement inventory management logic here
    }
    
}
