package com.Filip92.ecommerce.dto;

import com.Filip92.ecommerce.entity.Address;
import com.Filip92.ecommerce.entity.Customer;
import com.Filip92.ecommerce.entity.Order;
import com.Filip92.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
