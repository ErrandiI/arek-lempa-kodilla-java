package com.kodilla.good.patterns.challanges.Food2Door;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcesor orderProcesor = new OrderProcesor(new EmailNotification(), new Service(), new Repository());
        orderProcesor.process(orderRequest);
    }
}
