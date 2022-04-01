package com.springrest.assignmentQ8.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.assignmentQ8.entities.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer> {
    public Customer findById(int id);

    public Customer findByFirstName(String name);
}
