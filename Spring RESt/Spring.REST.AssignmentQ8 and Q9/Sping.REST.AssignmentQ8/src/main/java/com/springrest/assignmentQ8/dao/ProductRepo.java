package com.springrest.assignmentQ8.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.assignmentQ8.entities.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {
    public Product findById(int id);

    public Product findByName(String name);
}
