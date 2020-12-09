/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosabstratos;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class MetodosAbstratos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Shape> list = new ArrayList<>();
        
        
        
        System.out.println("Enter the number of shapes");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("Shape #"+i+" data:  ");
            System.out.print("Rectangle or Circle: (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED: ");
            Color color = Color.valueOf(sc.next());
            if(ch=='r'){
                System.out.print("Width:" );
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Retangle(width, height, color));
            }else{
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(radius, color));
            }
        }System.out.println("--------------");
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        
        sc.close();
    }
    
}
