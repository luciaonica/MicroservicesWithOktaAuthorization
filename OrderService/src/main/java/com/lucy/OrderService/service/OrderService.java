package com.lucy.OrderService.service;

import com.lucy.OrderService.model.OrderRequest;
import com.lucy.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
