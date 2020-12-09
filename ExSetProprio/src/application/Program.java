/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Leaners;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<Integer> A = new TreeSet<>(Arrays.asList(21,35,22));
        Set<Integer> B = new TreeSet<>(Arrays.asList(21,50));
        Set<Integer> C = new TreeSet<>(Arrays.asList(42,35,13));
        
        
        Set<Integer> sum = new TreeSet<>(A);
        sum.addAll(B);
        sum.addAll(C);
        System.out.println("Total Students "+sum.size());
        
        
        
        
       
        
    }
    
}
