package com.hsttcoder.dsmeta.controllers;

import com.hsttcoder.dsmeta.entities.Sale;
import com.hsttcoder.dsmeta.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SalesService service;

    @GetMapping
    public List<Sale> findSales() {
        return service.findSales();
    }
}
