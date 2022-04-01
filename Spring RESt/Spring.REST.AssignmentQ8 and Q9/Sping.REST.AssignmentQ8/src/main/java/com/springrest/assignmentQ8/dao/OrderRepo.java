package com.springrest.assignmentQ8.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.assignmentQ8.entities.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {

}