/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Comparator;

/**
 *
 * @author Antonio
 */
public class MyComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
       return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
