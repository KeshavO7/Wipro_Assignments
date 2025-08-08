package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private CartValidator cartValidator;

    @Override
    public String checkout(String cartId) {
        if (!cartValidator.validateCart(cartId)) {
            return "Cart is invalid";
        }

        
        List<String> cartItems = Arrays.asList("item1", "item2");

        for (String itemId : cartItems) {
            if (!inventoryService.isAvailable(itemId)) {
                return "Item out of stock";
            }
        }

        return "Checkout successful for " + cartId;
    }
}
