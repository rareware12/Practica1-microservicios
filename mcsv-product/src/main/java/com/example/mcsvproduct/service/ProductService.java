package com.example.mcsvproduct.service;

import com.example.mcsvproduct.model.Product;
import com.example.mcsvproduct.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void createProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public void updateProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public void deleteProduct(Long id) {

        productRepository.deleteById(id);

    }
}
