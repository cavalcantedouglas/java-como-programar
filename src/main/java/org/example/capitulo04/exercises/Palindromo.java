package org.example.capitulo04.exercises;

// Exercicio 4.30 - Palindromo

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número de 05 dígitos: ");
        int palindromo = input.nextInt();

        while (palindromo < 10000 || palindromo > 99999) {
            System.out.println("Número inválido, por favor, insira um número de 05 dígitos: ");
            palindromo = input.nextInt();
            }

        int a = palindromo / 10000;
        int b = (palindromo / 1000) % 10;
        int d = (palindromo / 10) % 10;
        int e = palindromo % 10;

        if (a == e && b == d) System.out.printf("O número %d é um palíndromo", palindromo);
        else System.out.printf("O número %d não é um palíndromo", palindromo);


        input.close();
    }

}
