/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.Scanner;


/**
 *
 * @author Antonio
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();
        
        System.out.println("How many values");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            String value = sc.next();
            ps.addValue(value);
        }
        ps.print();
        String x = ps.first();
        System.out.println(x);
        sc.close();
    }
    
}
