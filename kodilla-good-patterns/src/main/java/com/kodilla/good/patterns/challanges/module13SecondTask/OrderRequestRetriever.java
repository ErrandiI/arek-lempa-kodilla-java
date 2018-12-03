package com.kodilla.good.patterns.challanges.module13SecondTask;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Arek", "Lempa");
        Product product = new Product("Komputer");
        return new OrderRequest(user, product);
    }
}
