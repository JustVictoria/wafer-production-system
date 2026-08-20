package com.waferproduction.waferproductionsystem.model;

public class Machine {
    private String machineId;
    private String name;
    private StatusMachine status;

    public Machine (String machineId, String name, StatusMachine status){
        this.machineId = machineId;
        this.name = name;
        this.status = status;
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
