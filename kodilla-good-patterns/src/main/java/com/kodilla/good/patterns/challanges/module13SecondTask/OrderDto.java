package com.kodilla.good.patterns.challanges.module13SecondTask;

public class OrderDto {

    public User user;
    public Product product;
    public boolean isAvailable;

    public OrderDto(final User user, final Product product, final boolean isAvailable) {
        this.user = user;
        this.product = product;
        this.isAvailable = isAvailable;
    }
    public User getUser() {
        return user;
    }
    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
