package com.lucy.ProductService.service;

import com.lucy.ProductService.model.ProductRequest;
import com.lucy.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
