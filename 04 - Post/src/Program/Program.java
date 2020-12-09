/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats awesome!");
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Treveling to New Zeland",
                "I'm going to visit this wondeful country",
                12
        );
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);
    }
    
}
