package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String cName = sc.nextLine();

        System.out.println("E-mail: ");
        String cEmail = sc.nextLine();

        System.out.println("Birth Date (DD/MM/YYYY): ");
        Date cBirth = format.parse(sc.nextLine());

        Client client = new Client(cName, cEmail, cBirth);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order: ");
        int nItems = sc.nextInt();

        for (int i = 1; i <= nItems; i++){
            sc.nextLine();

            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product Name: ");
            String pName = sc.nextLine();

            System.out.println("Product price: ");
            double pPrice = sc.nextDouble();

            System.out.println("Quantity: ");
            int pQuantity = sc.nextInt();

            Product product = new Product(pName, pPrice);
            OrderItem it = new OrderItem(pQuantity, pPrice, product);

            order.addItems(it);
        }

        System.out.println(order);

        sc.close();
    }
}