/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeerro;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class TratamentoDeErro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        method1();
        System.out.println("End of program");
        
                
    }
    public static void method1(){
        System.out.println("***Method1 START***");
        method2();
        
        System.out.println("***Method1 END***");
    }
    public static void method2(){
        System.out.println("***Method2 START***");
         Scanner sc = new Scanner(System.in);
        
       try{
           String[] vect = sc.nextLine().split(" ");
       
        
        int position = sc.nextInt();
        
        System.out.println(vect[position]);
       } catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid Position");
           e.getCause();
           

       } catch(InputMismatchException e){
           System.out.println("InputError");

       }

       sc.close();
        System.out.println("***Method2 END***");

    }
    
}
