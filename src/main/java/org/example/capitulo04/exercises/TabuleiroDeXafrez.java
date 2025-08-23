package org.example.capitulo04.exercises;

// Exercicio 4.32 - Padrão de Tabuleiro de Damas em asterísticos.

public class TabuleiroDeXafrez {

    public static void main(String[] args) {

        int line = 1;
        while (line <= 8) {
            int row = 1;
            if (line % 2 == 0) System.out.print(" ");
            while (row <= 8 ) {
                 System.out.print("* ");
                 row++;
             }
            System.out.println();
            line++;
        }
    }
}
