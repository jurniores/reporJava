/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        List<Product> product = new ArrayList<>();

        System.out.println("Enter the number of product");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Common, used or imported (c/u/i");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (ch == 'c') {

                product.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.println("Date: ");
                Date date = sdf.parse(sc.next());
                product.add(new UsedProduct(name, price, date));
            } else {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                product.add(new ImportedProduct(name, price, customsFee));
            }
        }
        for (Product c: product ) {
            System.out.println(c.priceTag());
        }
        sc.close();
    }

}
