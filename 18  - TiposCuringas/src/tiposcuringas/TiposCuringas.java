/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposcuringas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class TiposCuringas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
      }
    }
