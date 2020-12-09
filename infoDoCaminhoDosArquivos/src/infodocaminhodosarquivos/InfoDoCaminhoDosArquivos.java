/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infodocaminhodosarquivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class InfoDoCaminhoDosArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        System.out.println("getName: "+ path.getName());
        System.out.println("getParent: "+path.getPath());
    }
    
}
