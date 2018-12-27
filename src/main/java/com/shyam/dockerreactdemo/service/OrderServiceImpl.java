package com.shyam.dockerreactdemo.service;

import com.shyam.dockerreactdemo.model.Order;
import com.shyam.dockerreactdemo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

/**
 * @author SVadikari on 12/27/18
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(String orderNumber) {
        return orderRepository.findById(orderNumber);
    }

    @Override
    public void deleteOrder(String orderNumber) {
        orderRepository.deleteById(orderNumber);
    }
}
