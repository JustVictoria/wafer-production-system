package com.waferproduction.waferproductionsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Batch {
    @Id
    private String batchId;
    private int quantity;
    @ManyToOne
    private ProductionOrder productionOrder;
    @ManyToOne
    private ProductionLine productionLine;
    //Dodatkowo:
    //private String status;
    //private String currentStep;
    //private String productionLine;


    //Konstruktory - które będą zapisywać dane wartości
    public Batch(String batchId, int quantity){
        this.batchId = batchId;
        this.quantity = quantity;
    }

    //Pusty Konstruktor dla (JPA)/(Entity)
    public Batch(){
    }


    //gettery
    public String getBatchId(){
        return batchId;
    }

    public int getQuantity(){
        return quantity;
    }

    //settery
    public void setProductionLine(ProductionLine productionLine){
        this.productionLine = productionLine;
    }

}

