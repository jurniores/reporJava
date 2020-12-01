/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Antonio
 */
public class Teste {

    private int marcha;
    private double velocidade;
    private String cor;
    private int aro;
     public void setMarcha(int marcha){
            this.marcha = marcha;
        }
    public int getMarcha(){
        return marcha;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade (int velocidade){
        this.velocidade = velocidade;
    }
    public static void main(String[] args) {
        Teste bicicleta = new Teste();
        
        bicicleta.setMarcha(3);
        
        System.out.println("Marcha "+ biciclegvta.getMarcha());
       
        
    }
    
}
