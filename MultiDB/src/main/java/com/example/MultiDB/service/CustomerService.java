package com.example.MultiDB.service;

import com.example.MultiDB.model.Customer;

import java.util.Optional;


public interface CustomerService {

    Optional<Customer> getCustomer(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer);
}
