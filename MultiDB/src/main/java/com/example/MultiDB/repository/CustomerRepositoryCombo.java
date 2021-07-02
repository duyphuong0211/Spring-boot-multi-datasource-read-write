package com.example.MultiDB.repository;

import com.example.MultiDB.repository.readRepository.CustomerReadRepository;
import com.example.MultiDB.repository.writeRepository.CustomerWriteRepository;

public interface CustomerRepositoryCombo extends CustomerReadRepository, CustomerWriteRepository {

}
