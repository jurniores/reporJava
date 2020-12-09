/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosdelimitados;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Antonio
 */
public class GenericosDelimitados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        String path = "C:\\Users\\Antonio\\Desktop\\testeDojava\\teste.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line !=null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max expensive: ");
            System.out.println(x);
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
