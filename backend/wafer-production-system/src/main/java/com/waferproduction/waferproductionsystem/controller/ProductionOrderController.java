package com.waferproduction.waferproductionsystem.controller;

import java.util.ArrayList;
import java.util.List;

import com.waferproduction.waferproductionsystem.model.Batch;
import com.waferproduction.waferproductionsystem.model.ProductionOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/production-orders")
public class ProductionOrderController {

    private static final int BATCH_SIZE = 10;

    @GetMapping
    public List<ProductionOrder> getProductionOrders() {

        ProductionOrder order1 = new ProductionOrder(
                "#01",
                "Apple",
                "TYPE_A",
                100,
                "CREATED",
                List.of()
        );

        ProductionOrder order2 = new ProductionOrder(
                "#02",
                "Samsung",
                "TYPE_B",
                150,
                "CREATED",
                List.of()
        );

        ProductionOrder order3 = new ProductionOrder(
                "#03",
                "Intel",
                "TYPE_C",
                200,
                "CREATED",
                List.of()
        );

        List<ProductionOrder> orders =
                List.of(order1, order2, order3);

        for (ProductionOrder order : orders) {
            List<Batch> batches = generateBatches(order);
            order.setBatches(batches);
        }

        return orders;
    }

    private List<Batch> generateBatches(ProductionOrder order) {

        validateQuantity(order.getTotalQuantity());

        int numberOfBatches =
                order.getTotalQuantity() / BATCH_SIZE;

        List<Batch> batches = new ArrayList<>();

        String typeLetter =
                order.getProduct()
                        .substring(order.getProduct().length() - 1);

        for (int i = 1; i <= numberOfBatches; i++) {

            String batchId =
                    typeLetter + "-" + String.format("%03d", i);

            Batch batch = new Batch(
                    batchId,
                    batchId,
                    BATCH_SIZE,
                    "CREATED",
                    null,
                    null
            );

            batches.add(batch);
        }

        return batches;
    }

    private void validateQuantity(int totalQuantity) {

        if (totalQuantity % BATCH_SIZE != 0) {
            throw new IllegalArgumentException(
                    "Total quantity must be divisible by " + BATCH_SIZE
            );
        }
    }
}