package app.exercicio;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho da matriz: L, C: ");
        Integer[][] mat = new Integer[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Pesquisar: ");
        int aux = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == aux) {
                    System.out.println("position " + i + "," + j);

                    if (i > 0) {
                        System.out.println("Up: " + mat[(i-1)][j]);
                    }
                    if ((i+1) < mat[i].length){
                        System.out.println("Down: " + mat[(i+1)][j]);
                    }

                    if (j > 0){
                        System.out.println("Left: " + mat[i][(j-1)]);
                    }

                    if ((j+1) < mat[i].length){
                        System.out.println("Right: " + mat[i][(j+1)]);
                    }
                }
            }
        }
    }
}
