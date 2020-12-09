/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Funcionarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            
            
            List<Funcionarios> list = new ArrayList<>();
            
            String line = br.readLine();
            
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Funcionarios(fields[0],Double.parseDouble(fields[2]),fields[1]));
                line = br.readLine();
            }
            System.out.println("Enter the salary: ");
            double n = sc.nextDouble();
            
            List <String> nameFunc = list.stream()
                    .filter(f->f.getSalary()>n)
                    .sorted((x,y)->x.getEmail().compareTo(y.getEmail()))
                    .map(f->f.getEmail())
                    .collect(Collectors.toList());
            double sumSalary = list.stream()
                    .filter(f->f.getName().charAt(0) =='M')
                    .map(f->f.getSalary())
                    .reduce(0.0, (x,y)->x+y);
            
              nameFunc.forEach(System.out::println);
               System.out.println("Sum of salary of people whose name starts with 'M': "+sumSalary);     
            
    }catch(IOException e){
            System.out.println(e);
    }
        sc.close();
    
 }
}
