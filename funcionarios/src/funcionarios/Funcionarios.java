/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author Antonio
 */
public class Funcionarios {

   private int matricula;
   private String nome;
   private double salario;
   
   public void setMatricula(int matricula){
       this.matricula = matricula;
   }
   public int getMatricula(){
       return matricula;
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
