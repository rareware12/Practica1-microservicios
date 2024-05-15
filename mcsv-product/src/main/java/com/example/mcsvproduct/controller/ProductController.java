package com.example.mcsvproduct.controller;

import com.example.mcsvproduct.model.Product;
import com.example.mcsvproduct.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/getAllProducts")
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/findProduct/{id}")
    public ResponseEntity<?> findProductById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @PutMapping("/updateProduct")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return productService.getProductById(product.getId());

    }

    @DeleteMapping("/deleteProduct/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }


}
