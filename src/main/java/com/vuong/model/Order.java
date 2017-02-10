package com.vuong.model;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private double total;
    private LocalDateTime dateTime;
    private Customer customer;

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public double getTotal() {
        return total;
    }

    public Order setTotal(double total) {
        this.total = total;
        return this;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Order setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
