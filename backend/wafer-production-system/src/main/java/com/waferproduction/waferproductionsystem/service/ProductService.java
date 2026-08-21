package com.waferproduction.waferproductionsystem.service;

import com.waferproduction.waferproductionsystem.model.Product;
import com.waferproduction.waferproductionsystem.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
        //Metoda zapisująca
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
