package com.klef.jfsd.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

import java.util.Date;

@SpringBootApplication
public class OrderManagementApplication implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrderManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
   
        orderRepository.save(new Order("Product1", 10, new Date(), "Customer1"));
        orderRepository.save(new Order("Product2", 5, new Date(), "Customer2"));
        orderRepository.save(new Order("Product3", 20, new Date(), "Customer3"));
    }
}
