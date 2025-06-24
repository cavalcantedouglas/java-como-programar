package org.example.capitulo04.exercises;

public class ElseOscilante {

    // Exercicio 4.28

    public static void main(String[] args) {
        int x = 5;
        int y = 8;

//        if (y == 8);
//        if (x == 5);
//        System.out.println("@@@@@");
//        else;
//        System.out.println("#####");
//        System.out.println("$$$$$");
//        System.out.println("&&&&&");

        // A
        // Saída: @@@@@%n, $$$$$%n, &&&&&
        System.out.println("Resultado saída a: ");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        // B, C
        // Saída: @@@@@%n,

        x = 5;
        y = 8;
        System.out.println("Resultado saída b: ");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }

        // D
        // Saída: #####%n, $$$$$%n, &&&&&

        x = 5;
        y = 7;
        System.out.println("Resultado saída d: ");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else;
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");

    }
}
