package com.waferproduction.waferproductionsystem.model;

public class Batch {
    private String name;
    private String batchId;
    private int quantity;
    private String status;
    private String currentStep;
    private String productionLine;


    //Konstruktory - które będą zapisywać dane wartości
    public Batch(String name, String batchId, int quantity, String status, String currentStep, String productionLine){
        this.name = name;
        this.batchId = batchId;
        this.quantity = quantity;
        this.status = status;
        this.currentStep = currentStep;
        this.productionLine = productionLine;
    }

    //gettery

    public String getName(){
        return name;
    }

    public String getBatchId(){
        return batchId;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getStatus(){
        return status;
    }

    public String getCurrentStep(){
        return currentStep;
    }

    public String getProductionLine(){
        return productionLine;
    }

}

