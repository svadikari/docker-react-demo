package com.shyam.dockerreactdemo.repository;

import com.shyam.dockerreactdemo.model.Order;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SVadikari on 12/26/18
 */

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
