package org.example.capitulo04.exercises;

import java.util.Scanner;

public class ModificarProgramaDaFigura {
    // Figura 4.12: Analysis.java
    // Análise dos resultados do exame utilizando instruções de controle aninhadas.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            while (result < 1 || result > 2) {
                System.out.println("Invalid Result!");
                System.out.println("Please, enter a valid result (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }
            if (result == 1){
                    passes += 1;
            } else {
                failures += 1;
            }
            studentCounter += 1;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) System.out.println("Bonus to instructor!");

        input.close();
    }
}

