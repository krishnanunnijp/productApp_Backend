package com.example.productApp_Backend.dao;

import com.example.productApp_Backend.model.product;
import org.springframework.data.repository.CrudRepository;

public interface productDao extends CrudRepository<product, Integer> {
}
