/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []valor = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Insira um numero"); 
            valor[i]= teclado.nextInt();
        }
        for(int i = 0; i<10;i++){
            if(valor[i]%2!=0){
                System.out.println("Ímpar "+valor[i]);
            }else{
                System.out.println("Par" + valor[i]);
            }
       
    }
    
    }

}
