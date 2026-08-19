package com.waferproduction.waferproductionsystem.model;

import java.time.LocalDate;
import java.util.List;

public class ProductionOrder{

    private String productionOrderId;
    private String customer;
    private Product product; //obiekt klasy produkt - w której jest type(A, B, C, D, E) i specification(wymiary, grubość, powłoka, wykończeniePowierzchni)
    private int totalQuantity; // ile wafli obejmuje zlecenie
    private LocalDate orderDate;
    //private LocalDate dueDate;
    //private String notes; // zapiski do zamówienia (specjalne życzenia klienta)

    private StatusProductionOrder statusPO;
    private List<Batch> batches;


    public ProductionOrder(String productionOrderId, String customer, Product product, int totalQuantity, LocalDate orderDate, StatusProductionOrder statusPO, List<Batch> batches ){
        this.productionOrderId = productionOrderId;
        this.customer = customer;
        this.product = product;
        this.totalQuantity = totalQuantity;
        this.orderDate = orderDate;
        this.statusPO = statusPO;
        this.batches = batches;
    }

    //gettery

    public String getProductionOrderId(){
        return productionOrderId;
    }

    public String getCustomer(){
        return customer;
    }

    public Product getProduct(){
        return product;
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }

    public StatusProductionOrder getStatusPO(){
        return statusPO;
    }

    public List<Batch> getBatches(){
        return batches;
    }
}