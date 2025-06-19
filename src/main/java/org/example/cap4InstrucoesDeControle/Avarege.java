package org.example.cap4InstrucoesDeControle;

import java.util.Scanner;
public class Avarege {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int avarege = total / 10;

        System.out.printf("%nTotal of all 10 grade is %d%n", total);
        System.out.printf("Classe avarege is %d%n", avarege);

        input.close();
    }

}
