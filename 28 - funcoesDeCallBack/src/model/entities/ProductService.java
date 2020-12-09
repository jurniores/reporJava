/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import entities.Product;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Antonio
 */
public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
       double sum = 0.0;
       for(Product p : list){
           if(criteria.test(p)){
               sum+=p.getPrice();
           }
       }
       return sum;
    };
}
