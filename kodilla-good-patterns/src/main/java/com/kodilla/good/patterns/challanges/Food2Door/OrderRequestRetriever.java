package com.kodilla.good.patterns.challanges.Food2Door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Producent producent = new Producent("Gruszka");
        Product product = new Product("Komputer", 15, 3000);
        return new OrderRequest(producent, product);
    }
}
