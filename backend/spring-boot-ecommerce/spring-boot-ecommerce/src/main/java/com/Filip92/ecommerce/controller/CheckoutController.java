package com.Filip92.ecommerce.controller;

import com.Filip92.ecommerce.service.ICheckoutService;
import com.Filip92.ecommerce.dto.Purchase;
import com.Filip92.ecommerce.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private ICheckoutService checkoutService;

    public CheckoutController(ICheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









