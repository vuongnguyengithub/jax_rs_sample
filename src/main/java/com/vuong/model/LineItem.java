package com.vuong.model;

public class LineItem {
    private Long id;
    private Integer quantity;
    private Product product;

    public Long getId() {
        return id;
    }

    public LineItem setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LineItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public LineItem setProduct(Product product) {
        this.product = product;
        return this;
    }
}
