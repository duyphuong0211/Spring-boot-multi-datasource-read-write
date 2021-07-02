package com.example.MultiDB.repository.readRepository;

import com.example.MultiDB.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerReadRepository extends CrudRepository<Customer, Long> {
}
