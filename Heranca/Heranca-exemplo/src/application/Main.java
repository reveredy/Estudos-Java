package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        List <Employee> employees = new ArrayList<>();

        System.out.print("How many Employees will be add? ");
        int employeeQuantity = sc.nextInt();

        for(int i = 0; i < employeeQuantity; i++){
            String eName;
            int eHours;
            double eValueHour, extraCharge;


            System.out.println("Enter Employee # " + (i+1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            String op = sc.next();

            sc.nextLine();
            switch (op){
                case "y":
                    System.out.print("Name: ");
                    eName = sc.nextLine();

                    System.out.print("Hours: ");
                    eHours= sc.nextInt();

                    System.out.print("Value per hour: ");
                    eValueHour = sc.nextDouble();

                    System.out.print("Additional charge: ");
                    extraCharge = sc.nextDouble();

                    employees.add(new OutsourceEmployee(eName, eHours, eValueHour, extraCharge));
                    break;
                case ("n"):
                    System.out.print("Name: ");
                    eName = sc.nextLine();

                    System.out.print("Hours: ");
                    eHours = sc.nextInt();

                    System.out.print("Value per hour: ");
                    eValueHour = sc.nextDouble();

                    employees.add(new Employee(eName, eHours, eValueHour));
                    break;

                default:
                    System.out.print("Enter a valid data (y/n)");
            }
        }

        for (Employee e : employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
