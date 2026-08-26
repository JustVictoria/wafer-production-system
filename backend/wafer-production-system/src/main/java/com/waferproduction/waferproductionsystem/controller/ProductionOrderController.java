package com.waferproduction.waferproductionsystem.controller;

import com.waferproduction.waferproductionsystem.model.ProductionOrder;
import com.waferproduction.waferproductionsystem.service.ProductionOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/production-order") //bez nazwy klasy controller, bo chodzi o zasób
public class ProductionOrderController{

    //konstruktor
    private final ProductionOrderService productionOrderService;
    public ProductionOrderController(ProductionOrderService productionOrderService){
        this.productionOrderService = productionOrderService;
    }

    @PostMapping
    public ProductionOrder createProductionOrder(@RequestBody ProductionOrder productionOrder){
        return productionOrderService.createProductionOrder(productionOrder);
    }

    @GetMapping
        public List<ProductionOrder> getAllProductionOrders(){
            return productionOrderService.getAllProductionOrders();
    }

    @GetMapping("/{id}")
    public ProductionOrder getProductionOrderById(@PathVariable String id){
        return productionOrderService.getProductionOrderById(id);
    }

    @PutMapping("/{id}")
    public ProductionOrder updateProductionOrder(@PathVariable String id , @RequestBody ProductionOrder productionOrder){
        return productionOrderService.updateProductionOrder(id, productionOrder);
    }

    @DeleteMapping("/{id}")
    public void deleteProductionOrder(@PathVariable String id) {
        productionOrderService.deleteProductionOrder(id);
    }

}