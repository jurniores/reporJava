/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrofuncionario;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter Departament's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.println("Name: ");
        String workerName =sc.nextLine();
        System.out.println("Level: ");
        String workerLevel =sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary =sc.nextDouble();
        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println("Enter contract #"+i+ " data:");
            System.out.println("Date(DD/MM/YYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Departament: "+ worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear + ": "+ String.format("%.2f", worker.income(year, month)));
        
                
                
                
        sc.close();
    }
    
}
