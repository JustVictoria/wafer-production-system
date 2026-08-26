package com.waferproduction.waferproductionsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Machine {
    @Id
    private String machineId;
    private String name;
    private StatusMachine status;
    @ManyToOne
    ProductionLine productionLine;

    public Machine (String machineId, String name, StatusMachine status){
        this.machineId = machineId;
        this.name = name;
        this.status = status;
    }

    public Machine(){

    }

    public String getMachineId(){
        return machineId;
    }

    public String getName(){
        return name;
    }

    public StatusMachine getStatus(){
        return status;
    }

}
