package com.kodilla.good.patterns.challanges.Food2Door;

public class OrderRequest {
    private Producent producent;
    private Product product;

    public OrderRequest(final Producent producent, final Product product) {
        this.producent = producent;
        this.product = product;
    }

    public Producent getProducent() {
        return producent;
    }

    public Product getProduct() {
        return product;
    }
}
