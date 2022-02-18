package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            int number = sc.nextInt();

            System.out.println("Holder: ");
            String holder = sc.next();

            System.out.println("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.println("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            double amt = sc.nextDouble();

            acc.withdraw(amt);

            System.out.println("New balance: " + acc.getBalance());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
