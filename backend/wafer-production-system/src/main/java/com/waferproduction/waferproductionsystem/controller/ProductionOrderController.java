package com.waferproduction.waferproductionsystem.controller;
import java.util.List;
import java.util.ArrayList;

import com.waferproduction.waferproductionsystem.model.ProductionOrder;
import com.waferproduction.waferproductionsystem.model.Batch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/production-orders")    //Wszytskie zapytania - mają trafiać pod konkretny adres


public class ProductionOrderController {

    public List<Batch> getBatches(int totalQuantity, String product) {

        List<ProductionOrder> orders = List.of(order1, order2, order3);
        for(ProductionOrder order : orders){
            order.setBatches(
                    getBatches(
                            order.getTotalQuantity(),
                            order.getProduct()
                    )
            );
        }
        return orders;


        int numberofBatches = totalQuantity /10; //podział na partie z założenia 1 Batch = 10 płytek krzemowych

        //Parametry wpisane na sztywno version1
        //Batch batch1 = new Batch("A-001-Sep15", "A-001", 100, "CREATED", "null", "null") {
        //};

    }

    @GetMapping
    public List<ProductionOrder> getProductionOrders(){

        List<Batch> batches = getBatches(170); // Ważne żeby zwiększyć zakres widoczności zmiennych


        //List.of() == batches to nie to samo
        ProductionOrder order1 = new ProductionOrder("#01", "Apple", "TYPE_A", 100, "CREATED", batches
        );

        ProductionOrder order2 = new ProductionOrder("#02", "Samsung", "Type_B", 150, "CREATED", List.of()

        );

        ProductionOrder order3 = new ProductionOrder("#03", "Intel", "TYPE_C", 200, "CREATED",List.of()
        );

        return List.of(order1, order2, order3);
    }

}
