/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        
        System.out.println("Total area: "+totalArea(myCircles));
    }
    
    //Se não extender a interrogação o FOR nunca irá funcionar, pois pode ser qualquer tipo de lista que irá entrar no curinga
    public static double totalArea(List<? extends Shape> list){
        double sum =0.0;
        for(Shape s: list){
            sum+=s.area();
        }
        return sum;
    }
    
}
