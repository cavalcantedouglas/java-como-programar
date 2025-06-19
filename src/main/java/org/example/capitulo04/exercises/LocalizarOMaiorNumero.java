package org.example.capitulo04.exercises;

import java.util.Scanner;

public class LocalizarOMaiorNumero {


    public static void main(String[] args) {

        int counter = 1;
        int number = 0;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 11) {
            number = input.nextInt();
            if (number > largest) largest = number;
            ++counter;
        }
        System.out.println(largest);
        input.close();
    }



}
