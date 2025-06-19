package org.example.capitulo04;

import java.util.Scanner;

public class ClassAvarege {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double avarege = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class avarege is %.2f", avarege);
        } else {
            System.out.println("No grades were entered");
        }

        input.close();
    }
}
