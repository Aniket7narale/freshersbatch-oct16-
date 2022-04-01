package com.springrest.assignmentQ8.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springrest.assignmentQ8.dao.ProductRepo;
import com.springrest.assignmentQ8.entities.Product;

@Component
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    // Adding Products
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    // Retrieving All the products
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    // Getting all products by id
    public Product getProductById(int id) {
        return productRepo.findById(id);
    }

    // Getting all products by name
    public Product getProductByName(String name) {
        return productRepo.findByName(name);
    }

    // Updating product by id
    public Product updateProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    // Deleting product by id
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

}
