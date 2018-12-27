package com.shyam.dockerreactdemo.service;

import com.shyam.dockerreactdemo.model.Order;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

/**
 * @author SVadikari on 12/27/18
 */


public interface OrderService {
    void saveOrder(Order order);
    Optional<Order> findById(String orderNumber);
    List<Order> findAll();
}
