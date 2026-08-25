package com.waferproduction.waferproductionsystem.repository;

import com.waferproduction.waferproductionsystem.model.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrder,String> {
}
