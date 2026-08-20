package com.waferproduction.waferproductionsystem.model;

import java.util.List;

public class QualityInspection {

    private Batch batch;
    private StatusQualityInspection status;
    private List<QualityMeasurement> measurements;


    public QualityInspection(Batch batch, StatusQualityInspection status, List<QualityMeasurement> measurements){
        this.batch = batch;
        this.status = status;
        this.measurements = measurements;
    }


    public Batch getBatch(){
        return batch;
    }
    public StatusQualityInspection getStatus(){
        return status;
    }
    public List<QualityMeasurement> getMeasurements(){
        return measurements;
    }


}
