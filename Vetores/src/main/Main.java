package main;

import main.quartos.Quarto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        Quarto[] aluguel = new Quarto[10];
        int qtdAlunos = 0, count = 0;

        //Faz a verificação se o range não é maior que o tamanho do array
        while (qtdAlunos < 1 || qtdAlunos > 10){
            qtdAlunos = 0;
            try {
                System.out.println("qtd novos alunos: ");
                qtdAlunos = sc.nextInt();

                if (qtdAlunos < 1 || qtdAlunos > 10){
                    System.out.println("Número fora do range permitido, escolha entre 1 e 10");
                }
            }catch (InputMismatchException mismatchException){
                System.out.println("Insira um número no campo qtd novos alunos");
                sc.next();
            }
        }

        //Faz a inserção dos dados de quem alugou o quarto e salva dentro do array

        while (count < qtdAlunos){
            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("E-mail: ");
            String email = sc.next();

            try {
                System.out.println("Quarto entre 0 - 9");
                int room = sc.nextInt();

                if (room < 0 || room > 9) {
                    System.out.println("O número de quartos disponiveis vai de 0 à 9, tente novamente.");
                } else if (aluguel[room] != null) {
                    System.out.println("Este quarto já está locado.");
                }else{
                    aluguel[room] = new Quarto(name, email);
                    count++;
                }
            }catch (InputMismatchException exception){
                System.out.println("Você deve inserir um número no campo room");
                sc.next();
                continue;
            }
        }

        //Passa por todos o array verificando se não está vazio, se não estiver ele imprimi
        System.out.println("Busy rooms:\n");
        for (int i = 0; i < aluguel.length; i++){
            if (aluguel[i] != null){
                System.out.println(i + ": " + aluguel[i].getName() + ", " + aluguel[i].getEmail());
            }
        }

        sc.close();
    }
}