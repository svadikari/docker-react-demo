package com.shyam.dockerreactdemo.controller;

import com.shyam.dockerreactdemo.model.Order;
import com.shyam.dockerreactdemo.model.OrderResponse;
import com.shyam.dockerreactdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author SVadikari on 12/26/18
 */

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderNumber}")
    public Order findOrder(@PathVariable String orderNumber) {
        return orderService.findById(orderNumber).orElse(null);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderResponse> saveOrder(@RequestBody @Valid Order order) {
        orderService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(new OrderResponse("SUCCESS", "Order#"+ order.getOrderNumber() +" saved successfully."));
    }

    @GetMapping
    public List<Order> findAllOrders() {
        return orderService.findAll();
    }
}
