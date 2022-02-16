package com.Filip92.ecommerce.dao;

import com.Filip92.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
