/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter full file path: ");
        
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            
            List<Product> list = new ArrayList<>();
            
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            //descobrindo a média
            double avg = list.stream()
                    .map(p ->p.getPrice())
                    .reduce(0.0, (x,y)->x+y)/list.size();
            System.out.println("Everage price: "+String.format("%.2f", avg));
            //criando um comparador de string
            Comparator<String> comp = (s1, s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
            
            List<String> names = list.stream()
                    //filtrando todos da lista que é menor que a média
                    .filter(p ->p.getPrice() < avg)
                    //filtrando só os nomes dos filtrados acima
                    .map(p->p.getName())
                    //Ordenando por ordem alfabética, algoritmo feito mais acima e definindo o reverso
                    .sorted(comp.reversed())
                    //Transformando em lista novamente
                    .collect(Collectors.toList());
            
            //Operação consumer mais rápida com lambda
            names.forEach(System.out::println);
            
        }catch(IOException e){
            System.out.println(e);
        }
        
        
        sc.close();
    }
    
}
