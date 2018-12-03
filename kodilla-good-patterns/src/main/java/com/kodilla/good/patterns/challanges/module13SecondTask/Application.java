package com.kodilla.good.patterns.challanges.module13SecondTask;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcesor orderProcesor = new OrderProcesor(new InformationService() {
            @Override
            public void inform(User user) {

            }
        }, new OrderService() {
            @Override
            public boolean order(User user, Product product) {
                return true;
            }
        }, new OrderRepository() {
            @Override
            public boolean createOrder(User user, Product product) {
                return true;
            }
        });
        orderProcesor.process(orderRequest);

    }
}
