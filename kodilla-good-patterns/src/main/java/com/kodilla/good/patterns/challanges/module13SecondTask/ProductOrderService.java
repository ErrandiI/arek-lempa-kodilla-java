package com.kodilla.good.patterns.challanges.module13SecondTask;

public class ProductOrderService {

    public boolean order(final User user, final Product product) {
        System.out.println("Order is done for: " + user.getName() + user.getSurName() + " . User order: " + product.getProduct() + ".");
        return true;
    }
}
