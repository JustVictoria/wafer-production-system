package com.waferproduction.waferproductionsystem.model;

import java.time.LocalDate;
import java.util.List;

public class ProductionOrder {

    private String productionOrderId;
    private String customer;
    private String product;
    private int totalQuantity;
    private String status;
    private LocalDate orderDate;

    private List<Batch> batches;    //referencja do listy obiektów



    //Konstruktor dla danego zmówienia - ProductionOrder
    public ProductionOrder(String productionOrderId, String customer, String product, int totalQuantity, String status, List<Batch> batches){

        this.productionOrderId = productionOrderId;
        this.customer = customer;
        this.product = product;
        this.totalQuantity = totalQuantity;
        this.status = status;
        this.batches = batches;

    }

    /*ProductionOrder order = new ProductionOrder(
            "#01",
            "Apple",
            "TYPE_A",
            100,
            "CREATED"
    );
    */


    //gettery

    public String getProductionOrderID(){
        return productionOrderId;
    }

    public String getCustomer(){
        return customer;
    }

    public String getProduct(){
        return product;
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }
    public String getStatus(){
        return status;
    }

    //Moge sie do tej listy - która oryginalnie jest w Batch, wyciągnąć rzeczy z listy  z zewnatrz
    public List<Batch> getBatches(){
        return batches;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }


    //setter
    public void setBatches(List<Batch> batches){
        this.batches = batches;
    }

}
