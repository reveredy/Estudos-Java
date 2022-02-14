package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();


        list.add(new SavingsAccount(1, "Maria", 500.0, 0.01));
        list.add(new BusinessAccount(2, "Mario", 600.0, 400.0));
        list.add(new SavingsAccount(3, "Pedro", 700.0, 0.01));
        list.add(new BusinessAccount(4, "Joana", 800.0, 500.0));


        double sum = 0;

        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n" , sum);

        for (Account acc : list){
            acc.deposit(10);
        }

        for (Account acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n" , acc.getNumber(), acc.getBalance());
        }
    }
}
