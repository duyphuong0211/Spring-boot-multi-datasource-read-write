package com.example.MultiDB.controller;

import com.example.MultiDB.handler.ResourceNotFoundException;
import com.example.MultiDB.model.Customer;
import com.example.MultiDB.service.CustomerService;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerControllerImpl {

    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") Long id) {

        return customerService.getCustomer(id).orElseThrow(() -> new ResourceNotFoundException("Invalid Customer"));
    }

    @RequestMapping(path = "/customer", method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @RequestMapping(path = "/customer", method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }
}
