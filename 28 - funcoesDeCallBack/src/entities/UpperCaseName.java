/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.function.Function;



/**
 *
 * @author Antonio
 */
public class UpperCaseName implements Function<Product, String> {

    

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
