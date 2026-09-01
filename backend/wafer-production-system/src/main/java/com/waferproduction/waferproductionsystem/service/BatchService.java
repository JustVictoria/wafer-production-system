package com.waferproduction.waferproductionsystem.service;

import com.waferproduction.waferproductionsystem.model.Batch;
import com.waferproduction.waferproductionsystem.model.ProductionLine;
import com.waferproduction.waferproductionsystem.repository.BatchRepository;
import com.waferproduction.waferproductionsystem.repository.ProductionLineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService {

    private final BatchRepository batchRepository;
    private final ProductionLineRepository productionLineRepository;

    //KONSTRUKTOR -- 2 parametrowy
    //Dzięki temu konstruktorowi BatchService ma dostep do 2 Repository
    public BatchService(BatchRepository batchRepository, ProductionLineRepository productionLineRepository ){
    this.batchRepository = batchRepository;
    this.productionLineRepository = productionLineRepository;
    }

    //R -read

    public List<Batch> getAllBatches(){
        return batchRepository.findAll();

    }

    public Batch getBatchById(String id){
        return batchRepository.findById(id).orElse(null);
    }

    public Batch assignLine (String batchId, String productionLineId){

        Batch existingBatch =
                batchRepository.findById(batchId).orElse(null);

        ProductionLine existingProductionLine =
                productionLineRepository.findById(productionLineId).orElse(null);

        if(existingBatch == null || existingProductionLine == null){
            return null;
        }

        existingBatch.setProductionLine(existingProductionLine);


        return batchRepository.save(existingBatch);
    }
    public Batch startProduction(String batchId){

        Batch existingBatch = batchRepository.findById(batchId).orElse(null);


        return existingBatch;
    }

}
