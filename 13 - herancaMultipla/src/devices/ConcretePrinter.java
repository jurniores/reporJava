/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author Antonio
 */
public class ConcretePrinter extends Device implements Printer{

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing: "+doc);
        
    }
    @Override
    public void print(String doc){
        System.out.println("Printing: "+doc);
    }
    
    
}
