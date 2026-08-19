package com.waferproduction.waferproductionsystem.model;

public class Product{

    private ProductType type;
    private ProductSpecification specification;

    public Product (ProductType type, ProductSpecification specification){
        this.type = type;
        this.specification = specification;
    }

    public ProductType getType(){
        return type;
    }

    public ProductSpecification getSpecification(){
        return specification;
    }

}
