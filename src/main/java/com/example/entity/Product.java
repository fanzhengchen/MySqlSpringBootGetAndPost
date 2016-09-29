package com.example.entity;

import javax.persistence.*;

/**
 * Created by mark on 16-9-29.
 */
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url;
    private String name;
    private int price;
    private int rate;
}
