package com.example.mcsvproduct.service;

import com.example.mcsvproduct.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void createProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Long id);

}
