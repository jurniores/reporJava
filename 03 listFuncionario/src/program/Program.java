/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;


import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        List <String> listErr = new ArrayList<>();
        int n;
        System.out.println("Digite o número de funcionários");
        n = sc.nextInt();
        
        for(int i = 0;i<n; i++){
            System.out.println("Digite os dados do primeiro funcionário");
            System.out.println("----------------------");
            System.out.println("Digite o id: ");

            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do funcionário");
            String name = sc.nextLine();
            System.out.println("Digite o salário do funcionário");
            double salary = sc.nextDouble();
            Employee func = new Employee(id, name, salary);
            list.add(func);
        }
        System.out.println("Digite o id do funcionário");
        int id = sc.nextInt();
        
        for(Employee x : list){
            if(x.getId() == id){
                System.out.println("Functionario: "+x.getName()+" Recebe: "+ x.getSalary());
                System.out.println("------PROMOÇÃO--------");
                System.out.println("Você deseja dar aumento ao funcionário? digite 1 para sim e 2 para não");
                int n1 = sc.nextInt();
                listErr.add("yes");
                if(n1==1){
                    System.out.println("Qual a porcentagem do aumento");
                    float por = sc.nextFloat();
                    System.out.println("O aumento foi de: "+ x.aumentaSalario(por));
                    System.out.println("Novo salário");
                    System.out.println(x.getSalary());
                }
            }else{
             listErr.add("no");
            }
            
            
        }
       if(listErr.indexOf("no")!= -1){
           if(listErr.indexOf("yes")== -1){
               System.out.println("Id não existe");
           }
       }
        sc.close();
        
        
       /* List<String> list = new ArrayList<>();
        list.add("Antonio");
        list.add("Maria");
        list.add("MArcos");
        list.add("Jose");
        
       
   
        
        for(String gosta : list){
            System.out.println(gosta);
        }
        System.out.println(list.indexOf("Antonio"));
        
        list.removeIf(x->x.charAt(0)!= 'A');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("---------------");
        String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);*/
    }
    
}
