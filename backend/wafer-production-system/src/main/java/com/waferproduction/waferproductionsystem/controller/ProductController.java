package com.waferproduction.waferproductionsystem.controller;

import com.waferproduction.waferproductionsystem.model.Product;
import com.waferproduction.waferproductionsystem.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/{id}/exists")
    public boolean productExists(@PathVariable Long id){
    return productService.productExists(id);
    }

    @PutMapping ("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

}
