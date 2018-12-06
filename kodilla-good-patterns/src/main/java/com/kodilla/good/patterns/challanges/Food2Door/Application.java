package com.kodilla.good.patterns.challanges.Food2Door;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcesor orderProcesor = new OrderProcesor(new InformationService() {
            @Override
            public void inform(Producent producent) {

            }
        }, new OrderService() {
            @Override
            public boolean order(Producent producent, Product product) {
                return true;
            }
        }, new OrderRepository() {
            @Override
            public boolean createOrder(Producent producent, Product product) {
                return true;
            }
        });
        orderProcesor.process(orderRequest);

    }
}
