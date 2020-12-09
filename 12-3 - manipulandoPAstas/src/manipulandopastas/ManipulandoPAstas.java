/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandopastas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ManipulandoPAstas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String strPath = sc.nextLine();
       
       File path = new File(strPath);
       
       
       File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder: folders){
            System.out.println(folder);
        }
        
        
        
                
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file : files){
            System.out.println(file);
            
        }
        
        
        boolean success = new File(strPath+"\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: "+success);
        
       sc.close();
    }
    
}
