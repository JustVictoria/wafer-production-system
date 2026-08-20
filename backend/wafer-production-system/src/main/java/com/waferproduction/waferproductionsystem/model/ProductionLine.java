package com.waferproduction.waferproductionsystem.model;

import java.util.List;
public class ProductionLine {

    private String productionLineId;
    private List<Machine> machines;
    private List<Batch> productionQueue;


    public ProductionLine(String productionLineId, List<Machine> machines, List<Batch> productionQueue){
        this.productionLineId = productionLineId;
        this.machines = machines;
        this.productionQueue = productionQueue;
    }


    public String getProductionLineId(){
        return productionLineId;
    }

    public List<Machine> getMachines(){
        return machines;
    }

    public List<Batch> getProductionQueue(){
        return productionQueue;
    }
}
