
import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
       
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        
        System.out.println("Enter the number of employee: ");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Employee #"+n+" data");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour");
            double valuePerHour = sc.nextDouble();
            if(ch=='y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                
                list.add(new OutsourcedEmployee(name, hours,valuePerHour ,additionalCharge));
            }else{
                
                list.add(new Employee(name,hours,valuePerHour));
            }
   
        }   
        System.out.println();
        System.out.println("PAYMENTS");
        for(Employee emp : list){
            System.out.println(emp.getName()+ " - $ "+ String.format("%.2f", emp.payment()));
            
        }
        sc.close();
    }
    
    
}

