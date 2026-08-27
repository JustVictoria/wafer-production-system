package com.waferproduction.waferproductionsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class ProductionLine {

    @Id
    private String productionLineId;
    @OneToMany(mappedBy="productionLine")
    private List<Machine> machines;
    @OneToMany(mappedBy = "productionLine")
    private List<Batch> productionQueue;


    public ProductionLine(String productionLineId, List<Machine> machines, List<Batch> productionQueue){
        this.productionLineId = productionLineId;
        this.machines = machines;
        this.productionQueue = productionQueue;
    }

    public ProductionLine(){

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
