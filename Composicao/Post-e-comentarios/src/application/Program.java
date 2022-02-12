package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOW thats awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I`m going to visit this wonderful country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1.toString());

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow", 5);

        Comment cp2 = new Comment("Good night");
        Comment cp3 = new Comment("May the force be with you");

        p2.addComment(cp2);
        p2.addComment(cp3);

        System.out.println(p2.toString());
    }
}
