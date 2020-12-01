/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import intites.Mmo;

/**
 *
 * @author Antonio
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mmo jogo = new Mmo("Sacer","Flesha de Pena",33.3, 115.5,44.4);
        
        System.out.println("Seu personagem é: "+jogo.getPersonagem()+" ele tem: "+jogo.getPower()+" e tem :" +jogo.getInteligencia()+ "e tem força de "+jogo.getForca());
        
        Mmo PernasoTony = new Mmo("Barbaro","Martelo",33.3, 200, 45.4);
        System.out.println("O personagem de tony"+ PernasoTony.getPersonagem());
        
        jogo.TrocaPoder("Visao");
        System.out.println(jogo.getPower());
    }
    
}
