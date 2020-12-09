/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancamultipla;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

/**
 *
 * @author Antonio
 */
public class HerancaMultipla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");
        
        ConcreteScanner s = new ConcreteScanner("2003");
            
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();
        
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: "+c.scan());
        
    }
    
}
