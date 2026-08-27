package com.waferproduction.waferproductionsystem.controller;

import com.waferproduction.waferproductionsystem.model.Batch;
import com.waferproduction.waferproductionsystem.service.BatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/api/batches")

public class BatchController{

    private final BatchService batchService;

    public BatchController(BatchService batchService){
        this.batchService = batchService;
    }

    //Read
    @GetMapping
    public List<Batch> getAllBatches(){
        return batchService.getAllBatches();
    }

    @GetMapping("/{id}")
    public Batch getBatchById(@PathVariable String id){
        return batchService.getBatchById(id);
    }

    //Update
    //Endpoint odpowiedzialny za przypisanie linii do konkretnego Batcha
    @PutMapping("/{batchId}/production-line/{productionLineId}")
    public Batch assignLine(@PathVariable String batchId, @PathVariable String productionLineId ){
        return batchService.assignLine(batchId, productionLineId);
    }

    @PutMapping("/{batchId}/start")
    public Batch startProduction(@PathVariable String batchId){
        return batchService.startProduction(batchId);
    }



}
