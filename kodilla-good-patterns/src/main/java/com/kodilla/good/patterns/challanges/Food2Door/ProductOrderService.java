package com.kodilla.good.patterns.challanges.Food2Door;

public class ProductOrderService {

    public boolean order(final Producent producent, final Product product) {
        System.out.println("Order is done for: " + producent.getName() + " . User order: "+  product.getAmount() +" "+ product.getProduct() + ". Order will cost: " + product.getAmount()*product.getPrize() +"." );
        return true;
    }
}
