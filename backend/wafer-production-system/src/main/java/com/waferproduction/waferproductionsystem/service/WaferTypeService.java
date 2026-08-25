package com.waferproduction.waferproductionsystem.service;

import com.waferproduction.waferproductionsystem.repository.WaferTypeRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WaferTypeService {

    private final WaferTypeRepository productRepository;

    //Domyślnie - Crud
    //PRZEKAZANIE
    public WaferTypeService(WaferTypeRepository productRepository){
        this.productRepository = productRepository;
    }

    //C - create
    public com.waferproduction.waferproductionsystem.model.WaferType createWaferType(com.waferproduction.waferproductionsystem.model.WaferType product){
        return productRepository.save(product);
    }

    //R -read
    public List<com.waferproduction.waferproductionsystem.model.WaferType> getAllWaferTypes(){
        return productRepository.findAll();
    }
    public com.waferproduction.waferproductionsystem.model.WaferType getWaferTypeById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    public boolean waferTypeExists(Long id){
        return productRepository.existsById(id);
    }

    //D - delate
    public void deleteWaferType(Long id){
        productRepository.deleteById(id);
    }







}
