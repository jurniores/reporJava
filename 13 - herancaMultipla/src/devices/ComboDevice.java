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
public class ComboDevice extends Device implements Scanner,Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo printing: "+doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo processing: "+doc);
    }
    
    
}
