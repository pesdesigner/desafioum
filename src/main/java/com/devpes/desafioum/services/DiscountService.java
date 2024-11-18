package com.devpes.desafioum.services;

import com.devpes.desafioum.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public double discount(Order order){
        return order.getBasic() * order.getDiscount() / 100;
    }
}
