/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.Color;

/**
 *
 * @author Antonio
 */
public class Retangle extends Shape{
    private Double width;
    private Double height;
    public Retangle(){
        
    }

    

    public Retangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return height;
    }

    public void setHeigth(Double height) {
        this.height = height;
    }
    
    @Override
    public double area() {
        return width*height;
    }
    
}
