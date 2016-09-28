package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 16-9-28.
 */
@RestController
@RequestMapping(value = "/products")
public class ProductsController {


    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String getProducts(@PathVariable("page") String page) {

        return "getProducts";
    }
}
