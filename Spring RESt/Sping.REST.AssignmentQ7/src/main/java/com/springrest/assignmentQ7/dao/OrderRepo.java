package com.springrest.assignmentQ7.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.assignmentQ7.entities.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {

    public Order findById(int id);

    public Order findByName(String name);
}
