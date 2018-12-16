package com.kodilla.good.patterns.challanges.Food2Door;

public class OrderProcesor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcesor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isAvailable = orderService.order(orderRequest.getProducent(), orderRequest.getProduct());
        if (isAvailable) {
            informationService.inform(orderRequest.getProducent());
            orderRepository.createOrder(orderRequest.getProducent(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProducent(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getProducent(), orderRequest.getProduct(), false);
        }
    }
}
