package org.example.capitulo04.exercises;

// Exercicio 4.32 - Padrão de Tabuleiro de Damas em asterísticos.

public class TabuleiroDeXafrez {

    public static void main(String[] args) {

        int number = 1;


        while (number <= 8) {
            int line = 1;
            if (number % 2 == 1) {
               while (line <= 8) {
                   System.out.print("* ");
                   System.out.print(" ");
                   line++;
               }
           } else {
               while (line <= 8) {
                   System.out.print(" ");
                   System.out.print("* ");
                   line++;
               }
           }
            System.out.println();
            number++;
        }

    }

}
