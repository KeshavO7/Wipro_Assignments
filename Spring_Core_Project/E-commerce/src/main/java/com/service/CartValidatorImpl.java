package com.service;

import org.springframework.stereotype.Component;

@Component
public class CartValidatorImpl implements CartValidator {

    @Override
    public boolean validateCart(String cartId) {
        
        return cartId != null && cartId.startsWith("CART");
    }
}
