package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mark on 16-9-28.
 */
@RestController
@RequestMapping(value = "/products")
public class ProductsController {


    @Autowired
    private ProductsDao mDao;


    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public List<Product> getProducts(@PathVariable("page") String page) {
        return mDao.findAll();
    }
}
