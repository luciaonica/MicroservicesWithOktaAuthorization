package com.lucy.PaymentService.service;

import com.lucy.PaymentService.model.PaymentRequest;
import com.lucy.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
