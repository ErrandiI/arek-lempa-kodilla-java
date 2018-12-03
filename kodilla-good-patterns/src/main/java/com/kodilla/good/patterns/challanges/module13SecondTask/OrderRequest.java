package com.kodilla.good.patterns.challanges.module13SecondTask;

public class OrderRequest {
    private User user;
    private Product product;

    public OrderRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
