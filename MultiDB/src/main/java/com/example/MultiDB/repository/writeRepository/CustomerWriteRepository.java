package com.example.MultiDB.repository.writeRepository;

import com.example.MultiDB.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerWriteRepository extends CrudRepository<Customer, Long> {
}
