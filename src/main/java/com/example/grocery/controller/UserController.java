package com.example.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.model.BookRequest;
import com.example.grocery.model.GroceryItem;
import com.example.grocery.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/view-items")
    public ResponseEntity<List<GroceryItem>> viewItems() {
        List<GroceryItem> items = userService.viewItems();
        return ResponseEntity.ok(items);
    }

    @PostMapping("/book-items")
    public ResponseEntity<String> bookItems(@RequestBody List<BookRequest> bookRequests) {
        userService.bookItems(bookRequests);
        return ResponseEntity.ok("Items booked successfully");
    }

}
