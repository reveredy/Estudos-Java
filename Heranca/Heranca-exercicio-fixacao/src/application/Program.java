package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {
        List <Product> products = new ArrayList<>();

	    Scanner sc = new Scanner(System.in);

        System.out.print("How many products will be added? ");
        int nProducts = sc.nextInt();

        for (int i = 1; i <= nProducts; i++){
            System.out.print("Common, used or imported? ");
            String op = sc.next();
            sc.nextLine();

            System.out.print("Name: ");
            String pName = sc.nextLine();

            System.out.print("Price: ");
            double pPrice = sc.nextDouble();
            sc.nextLine();

            switch (op){
                case "c":
                    products.add(new Product(pName, pPrice));
                    break;
                case "u":
                    System.out.print("Manufacture Date (DD/MM/YYYY): ");
                    Date pManDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                    products.add(new UsedProduct(pName, pPrice, pManDate));
                    break;
                case "i":
                    System.out.print("Customs fee: ");
                    double pCustFee = sc.nextDouble();

                    products.add(new ImportedProduct(pName, pPrice, pCustFee));
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product prod : products){
            System.out.println(prod.priceTag());
        }
    }
}
