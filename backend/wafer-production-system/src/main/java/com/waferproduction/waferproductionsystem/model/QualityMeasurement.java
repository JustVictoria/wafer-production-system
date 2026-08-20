package com.waferproduction.waferproductionsystem.model;

public class QualityMeasurement {

    private String metricName;
    private double measuredValue;
    private double minValue;
    private double maxValue;

    public QualityMeasurement(String metricName, double measuredValue, double minValue, double maxValue){
        this.metricName = metricName;
        this.measuredValue = measuredValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getMetricName(){
        return metricName;
    }

    public double getMeasuredValue(){
        return measuredValue;
    }

    public double getMinValue(){
        return minValue;
    }

    public double getMaxValue(){
        return maxValue;
    }
}
