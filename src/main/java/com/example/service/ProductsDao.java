package com.example.service;

import com.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mark on 16-9-29.
 */
@Transactional
public interface ProductsDao extends JpaRepository<Product, Long> {

//    public Product findByName(String name);

}
