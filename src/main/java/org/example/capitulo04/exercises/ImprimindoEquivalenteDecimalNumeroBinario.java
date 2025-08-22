package org.example.capitulo04.exercises;


import java.util.Scanner;

// Exercicio 4.31 - Imprimindo o equivalente decimal de um número binário.
public class ImprimindoEquivalenteDecimalNumeroBinario {

    public static void main(String[] args) {

        System.out.println("Por favor insira um número binário: ");
        Scanner input = new Scanner(System.in);
        int binario = input.nextInt();

        System.out.print("O equivalente binário do numéro " + binario + " é: ");

        int decimalValue = 0;
        int powerOfTwo = 1;

        while (binario > 0) {
            int binaryNumber = binario % 10;
            decimalValue += binaryNumber * powerOfTwo;
            binario /= 10;
            powerOfTwo *= 2;
        }
        System.out.print(decimalValue);

        input.close();

    }
}
