/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.PriceUpdate;
import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        /*Consumer<Product> cons = p -> p.setPrice(p.getPrice()*1.1);
        
        list.forEach(cons);
        ou
        */
        list.forEach(p -> p.setPrice(p.getPrice()*1.1));
        list.forEach(System.out::println);
    }

}
