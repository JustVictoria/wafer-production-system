package com.waferproduction.waferproductionsystem.model;

public class Batch {
    private String batchId;
    private int quantity;
    //private String status;
    //private String currentStep;
    //private String productionLine;


    //Konstruktory - które będą zapisywać dane wartości
    public Batch(String batchId, int quantity){
        this.batchId = batchId;
        this.quantity = quantity;
    }

    //gettery

    public String getBatchId(){
        return batchId;
    }

    public int getQuantity(){
        return quantity;
    }

}

