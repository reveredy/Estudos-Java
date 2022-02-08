package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tamanho da matriz: ");
        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];



        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("n " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal:");
        diagonal(matriz);

        int count= 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0;j < matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        sc.close();
    }

    public static void diagonal(int[][] a){
        for (int i= 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.println(a[i][i]);
            }
        }
    }
}
