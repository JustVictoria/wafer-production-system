package com.waferproduction.waferproductionsystem.service;

import com.waferproduction.waferproductionsystem.model.ProductionOrder;
import com.waferproduction.waferproductionsystem.repository.ProductionOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductionOrderService {

    private final ProductionOrderRepository productionOrderRepository;

    //przekazanie do repository
    public ProductionOrderService(ProductionOrderRepository productionOrderRepository){
        this.productionOrderRepository = productionOrderRepository;
    }

    //C - create
    public ProductionOrder createProductionOrder(ProductionOrder productionOrder){
        return productionOrderRepository.save(productionOrder);
    }

    //R - read
    public ProductionOrder getProductionOrderById(String id){
        return productionOrderRepository.findById(id).orElse(null);
    }

    public List<ProductionOrder> getAllProductionOrders() {
        return productionOrderRepository.findAll();
    }

    //U - update
    public ProductionOrder updateProductionOrder(String id, ProductionOrder productionOrder){

        ProductionOrder existingProductionOrder =
                productionOrderRepository.findById(id).orElse(null);

         if(existingProductionOrder == null){
             return null;
         }
         existingProductionOrder.setCustomer(productionOrder.getCustomer());


    }


}
