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
public class TestaFuncionario {
    public static void main(String[] args){
        Funcionarios f1 = new Funcionarios();
        
        
        f1.setNome("Renata");
        System.out.println("Nome>"+f1.getNome());
    }
}
