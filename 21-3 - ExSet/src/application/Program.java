/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.LogEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while(line != null ){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username,moment));
                line = br.readLine();
            }
            System.out.println("Total users: "+set.size());
            
            
        }catch(IOException e){
            System.out.println("Error :"+e.getMessage());
        }
        sc.close();
    }
    
}
