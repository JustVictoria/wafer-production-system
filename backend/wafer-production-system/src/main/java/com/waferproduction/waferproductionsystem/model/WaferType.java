package com.waferproduction.waferproductionsystem.model;

import jakarta.persistence.*;

@Entity
public class WaferType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //sposób generowania nazw w id
    private Long id; //kolumna 1

    @Enumerated(EnumType.STRING)
    private ProductType type; //kolumna 2

    @Embedded
    private ProductSpecification specification; //obiekt innej klasy

    public WaferType(ProductType type, ProductSpecification specification){
        this.type = type;
        this.specification = specification;
    }

    public WaferType(){ //Pusty konstruktor, beazargumentowy, który może utworzyć obiekt produkt z interfejsu

    }

    public ProductType getType(){
        return type;
    }

    public ProductSpecification getSpecification(){
        return specification;
    }

    public void setType(ProductType type){
        this.type = type;
    }
}
