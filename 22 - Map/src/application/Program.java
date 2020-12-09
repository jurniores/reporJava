/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone","993787268");
        
        System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
        
        if(cookies.containsKey("phone")){
            System.out.println("Phone number: "+cookies.get("phone"));
        }
        
        cookies.remove("email");
        cookies.put("phone", "878778955");
        for(String n : cookies.keySet()){
            System.out.println(n + ": "+cookies.get(n));
        }*/
        Map<Product, Double> stock = new HashMap<>();
        
        
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        Product ps = new Product("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
        
    }

}
