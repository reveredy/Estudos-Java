package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            String op = sc.next();
            sc.nextLine();

            System.out.print("Color: (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());

            if(op.equals("r")){
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(color, radius));
            }

        }

        for (Shape s: shapes){
            System.out.println(String.format("%.2f", s.area()));
        }
    }
}
