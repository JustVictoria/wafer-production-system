package com.waferproduction.waferproductionsystem.repository;

import com.waferproduction.waferproductionsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}