package org.example.capitulo04.exercises;


import java.util.Scanner;

// Exercicio 4.31 - Imprimindo o equivalente decimal de um número binário.
public class ImprimindoEquivalenteDecimalNumeroBinario {

    public static void main(String[] args) {

        System.out.println("Por favor insira um número binário: ");
        Scanner input = new Scanner(System.in);
        int binario = input.nextInt();

        int a = binario % 10;
        int b = (binario / 10) % 10;
        int c = (binario / 100) % 10;
        int d = binario / 1000;

        int equivalenteDecimal = a * 1 + b * 2 + c * 4 + d * 8;

        System.out.println("Equivalente decimal do número binário " + binario + " é = " + equivalenteDecimal);


        input.close();

    }
}
