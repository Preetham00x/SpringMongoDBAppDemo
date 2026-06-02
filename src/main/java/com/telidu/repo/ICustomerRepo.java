package com.telidu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telidu.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
