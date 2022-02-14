package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Pessoa> pessoas = new ArrayList<>();

        double impostoArrecadado = 0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Individual or Company (i/c)? ");
            String op = sc.next();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (op.equals("i")){
                System.out.print("Health expenditures: ");
                double saude = sc.nextDouble();

                pessoas.add(new PessoaFisica(nome, rendaAnual, saude));
            }else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                pessoas.add(new PessoaJuridica(nome, rendaAnual, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.imposto()));
            impostoArrecadado += pessoa.imposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", impostoArrecadado));
    }
}
