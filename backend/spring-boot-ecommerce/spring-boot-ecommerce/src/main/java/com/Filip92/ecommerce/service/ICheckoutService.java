package com.Filip92.ecommerce.service;

import com.Filip92.ecommerce.dto.PaymentInfo;
import com.Filip92.ecommerce.dto.Purchase;
import com.Filip92.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface ICheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
