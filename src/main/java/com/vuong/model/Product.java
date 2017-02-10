package com.vuong.model;

public class Product {
    private Long id;
    private String name;
    private Double cost;

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getCost() {
        return cost;
    }

    public Product setCost(Double cost) {
        this.cost = cost;
        return this;
    }
}
