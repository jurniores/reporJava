/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intites;

/**
 *
 * @author Antonio
 */
public class Mmo {
  private String personagem;
  private String power;
  private double des;
  private double inteligencia;
  private double forca;
  
  public Mmo(String personagem, String power, double des, double inteligencia, double forca){
      this.personagem = personagem;
      this.power = power;
      this.des = des;
      this.inteligencia = inteligencia; 
      this.forca =forca;
      
  }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getDes() {
        return des;
    }

    public void setDes(float des) {
        this.des = des;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(float inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(float forca) {
        this.forca = forca;
    }
    
    public void TrocaPoder(String poder){
        power = poder;
    }
    
  
    
}
