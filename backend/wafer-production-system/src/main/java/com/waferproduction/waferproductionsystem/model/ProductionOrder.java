package com.waferproduction.waferproductionsystem.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class ProductionOrder{

    @Id
    private String productionOrderId;
    private String customer;
    @ManyToOne //Ponieważ wiele ProductionOrder może dotyczyć jednego typu produktu (A, B, C, D)
    private Product product; //obiekt klasy produkt - w której jest type(A, B, C, D, E) i specification(wymiary, grubość, powłoka, wykończeniePowierzchni)
    private int totalQuantity; // ile wafli obejmuje zlecenie
    private LocalDate orderDate;
    //private LocalDate dueDate;
    //private String notes; // zapiski do zamówienia (specjalne życzenia klienta)

    @Enumerated(EnumType.STRING)
    private StatusProductionOrder statusPO;
    @OneToMany
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

    public ProductionOrder(){

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