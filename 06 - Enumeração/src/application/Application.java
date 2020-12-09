/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
    
}
