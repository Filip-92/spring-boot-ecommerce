package com.Filip92.ecommerce.service;

import com.Filip92.ecommerce.dto.Purchase;
import com.Filip92.ecommerce.dto.PurchaseResponse;

public interface ICheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
