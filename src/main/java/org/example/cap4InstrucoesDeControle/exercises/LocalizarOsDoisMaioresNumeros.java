package org.example.cap4InstrucoesDeControle.exercises;

import java.util.Scanner;

public class LocalizarOsDoisMaioresNumeros {

    public static void main(String[] args) {

        int counter = 1;
        int largest = 0;
        int secondLargest = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 11) {
           int number = input.nextInt();
            if (number > largest) largest = number;
            else if (number > secondLargest) secondLargest = number;
            ++counter;
        }
        System.out.printf("O maior: %d, o segundo maior: %d", largest, secondLargest);
        input.close();
    }
}
