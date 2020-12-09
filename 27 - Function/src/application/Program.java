/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import entities.UpperCaseName;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        Function <Product, String> func = p -> p.getName().toUpperCase();
        /*
        Métodos de usar a Function dentro de uma lista
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        List<String> names = list.stream().map(func).collect(Collectors.toList());*/
        List<String> names = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());
        
        names.forEach(System.out::println);
    }
    
}
