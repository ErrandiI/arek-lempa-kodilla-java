package com.kodilla.good.patterns.challanges.Food2Door;

public class OrderDto {

    public Producent producent;
    public Product product;
    public boolean isAvailable;

    public OrderDto(final Producent producent, final Product product, final boolean isAvailable) {
        this.producent = producent;
        this.product = product;
        this.isAvailable = isAvailable;
    }
    public Producent getProducent() {
        return producent;
    }
    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
