package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InventoryServiceImpl implements InventoryService {

  
    private List<String> availableItems = Arrays.asList("item1", "item2", "item3");

    @Override
    public boolean isAvailable(String itemId) {
        return availableItems.contains(itemId);
    }
}
