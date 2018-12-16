package com.kodilla.stream.invoice.simple;

public class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(SimpleProduct produkt, double quantity) {
        this.product = produkt;
        this.quantity = quantity;
    }

    public SimpleProduct getProdukt() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;

    }
}
