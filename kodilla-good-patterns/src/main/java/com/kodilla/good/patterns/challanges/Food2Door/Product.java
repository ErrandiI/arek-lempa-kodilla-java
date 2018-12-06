package com.kodilla.good.patterns.challanges.Food2Door;

public class Product {
    private String product;
    private int amount;
    private double prize;

    public Product(String product, int amount, double prize) {
        this.product = product;
        this.amount = amount;
        this.prize = prize;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrize() {
        return prize;
    }
}
