package main.exercicios.App;
import main.exercicios.App.Utilities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> func = new ArrayList<>();
        int count = 0;

        System.out.println("How many employees do you want to add? ");
        int numEmployees = sc.nextInt();

        while (count < numEmployees){
            System.out.println("id: ");
            int id = sc.nextInt();

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            if (func.contains(id)){
                System.out.println("You already add this employee id, try another id: ");
                continue;
            }else {
                func.add(new Employee(id, name, salary));
                count++;
            }
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        for (int i = 0; i < func.size(); i++){
            if (func.get(i).getId() == idIncrease){
                System.out.println("Enter the percentage: ");
                int percentage = sc.nextInt();

                func.get(i).aumentarSalario(percentage);
            }else {
                System.out.println("Id não encontrado");
            }
        }

        for (Employee list : func){
            System.out.println(list.getId() + ", " + list.getNome() + ", " + list.getSalario());
        }

        sc.close();
    }
}
