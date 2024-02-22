package com.example.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.model.GroceryItem;
import com.example.grocery.model.InventoryRequest;
import com.example.grocery.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
    private AdminService adminService;

	@PostMapping("/add-item")
    public ResponseEntity<String> addGroceryItem(@RequestBody GroceryItem groceryItem) {
        adminService.addGroceryItem(groceryItem);
        return ResponseEntity.ok("Item added successfully");
    }

    @GetMapping("/view-items")
    public ResponseEntity<List<GroceryItem>> viewItems() {
        List<GroceryItem> items = adminService.viewItems();
        return ResponseEntity.ok(items);
    }

    @DeleteMapping("/remove-item/{itemId}")
    public ResponseEntity<String> removeItem(@PathVariable Long itemId) {
        adminService.removeGroceryItem(itemId);
        return ResponseEntity.ok("Item removed successfully");
    }

    @PutMapping("/update-item")
    public ResponseEntity<String> updateItem(@RequestBody GroceryItem groceryItem) {
        adminService.updateGroceryItem(groceryItem);
        return ResponseEntity.ok("Item updated successfully");
    }

    @PutMapping("/manage-inventory")
    public ResponseEntity<String> manageInventory(@RequestBody InventoryRequest request) {
        adminService.manageInventory(request);
        return ResponseEntity.ok("Inventory managed successfully");
    }

}
