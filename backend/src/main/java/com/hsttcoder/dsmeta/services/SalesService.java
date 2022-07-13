package com.hsttcoder.dsmeta.services;

import com.hsttcoder.dsmeta.entities.Sale;
import com.hsttcoder.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
       return repository.findAll();
    }
}
