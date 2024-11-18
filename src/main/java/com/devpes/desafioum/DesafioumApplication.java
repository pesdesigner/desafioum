package com.devpes.desafioum;

import com.devpes.desafioum.entities.Order;
import com.devpes.desafioum.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioumApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioumApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println(order1.toString() + orderService.total(order1));
		System.out.println(order2.toString() + orderService.total(order2));
		System.out.println(order3.toString() + orderService.total(order3));
	}
}
