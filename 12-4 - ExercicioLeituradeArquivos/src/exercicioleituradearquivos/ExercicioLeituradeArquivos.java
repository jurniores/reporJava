/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioleituradearquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ExercicioLeituradeArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\Antonio\\Desktop\\testeDojava\\ex.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Digite a quantidade de produtos");
            int n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                String line = sc.nextLine();
                
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
