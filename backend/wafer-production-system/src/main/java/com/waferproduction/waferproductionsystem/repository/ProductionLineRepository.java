package com.waferproduction.waferproductionsystem.repository;

import com.waferproduction.waferproductionsystem.model.ProductionLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionLineRepository extends JpaRepository<ProductionLine, String> {
}
