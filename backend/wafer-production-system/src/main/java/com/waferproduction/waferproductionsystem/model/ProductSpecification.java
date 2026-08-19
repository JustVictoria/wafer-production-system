package com.waferproduction.waferproductionsystem.model;

public class ProductSpecification {

    private double diameter;
    private double thickness;
    private CrystalOrientation crystalOrientation;
    private SurfaceFinish surfaceFinish;

    public ProductSpecification(double diameter, double thickness, CrystalOrientation crystalOrientation, SurfaceFinish surfaceFinish){
        this.diameter = diameter;
        this.thickness = thickness;
        this.crystalOrientation = crystalOrientation;
        this.surfaceFinish = surfaceFinish;
    }

    public double getDiameter(){
        return diameter;
    }
    public double getThickness(){
        return thickness;
    }
    public CrystalOrientation getCrystalOreintation(){
        return crystalOrientation;
    }
    public SurfaceFinish getSurfaceFinish(){
        return surfaceFinish;
    }
}
