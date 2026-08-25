package com.waferproduction.waferproductionsystem.controller;

import com.waferproduction.waferproductionsystem.model.WaferType;
import com.waferproduction.waferproductionsystem.service.WaferTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wafer-types")
public class WaferTypeController {

    private final WaferTypeService waferTypeService;

    public WaferTypeController(WaferTypeService waferTypeService) {
        this.waferTypeService = waferTypeService;
    }

    @GetMapping
    public List<WaferType> getAllWaferTypes() {
        return waferTypeService.getAllWaferTypes();
    }

    @PostMapping
    public WaferType createWaferType(@RequestBody WaferType waferType) {
        return waferTypeService.createWaferType(waferType);
    }

    @GetMapping("/{id}")
    public WaferType getWaferTypeById(@PathVariable Long id) {
        return waferTypeService.getWaferTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteWaferType(@PathVariable Long id) {
        waferTypeService.deleteWaferType(id);
    }

    @GetMapping("/{id}/exists")
    public boolean waferTypeExists(@PathVariable Long id) {
        return waferTypeService.waferTypeExists(id);
    }

}