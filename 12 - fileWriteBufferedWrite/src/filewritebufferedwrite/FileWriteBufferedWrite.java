/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewritebufferedwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Antonio
 */
public class FileWriteBufferedWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning", "Good Afternoon","Good Nigth"};
        String path = "C:\\Users\\Antonio\\Desktop\\testeDojava\\teste1.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
