/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        
        //Transformando uma lista em uma stream
        Stream<Integer> st1 = list.stream().map(x -> x*10);
        
        //Convertendo a stream em array para imprimir
        System.out.println(Arrays.toString(st1.toArray()));
        
        //Criando um Stream autonoma
        Stream<String> st2 = Stream.of("Maria", "Alex","Bob");
        System.out.println(Arrays.toString(st2.toArray()));
        
        //criando uma stream apartir do método iterate quase igual ao reduce do javascript
        Stream<Integer> st3 = Stream.iterate(0, x ->x+2);
        
        //imprimindo a stream colocando um limite de 10 indices e depois tornando ela em array novamente
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        //Criando a sequencia de fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L,1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p->p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
    
}
