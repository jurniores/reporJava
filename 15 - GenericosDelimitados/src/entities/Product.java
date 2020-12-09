/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;



/**
 *
 * @author Antonio
 */
public class Product implements Comparable<Product>{
    private String name;
    private Double price;
    
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   public String toString(){
       return name+", "+String.format("%.2f", price);
   }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

  
}
