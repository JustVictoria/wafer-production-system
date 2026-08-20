package com.waferproduction.waferproductionsystem.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class ProductSpecification {

    private double diameter;
    private double thickness;

    @Enumerated(EnumType.STRING)
    private CrystalOrientation crystalOrientation;
    @Enumerated(EnumType.STRING)
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
