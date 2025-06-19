package org.example.cap4InstrucoesDeControle.exercises;

import java.util.Scanner;

public class SaidaNoFormatoDeTabela {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int controller = 1;
        System.out.println("N     10*N    100*N    1000*N");
        while(controller < 6) {
            int n = controller;
            System.out.printf("%d     %d      %d      %d%n", n, 10*n, 100*n, 1000*n);
            controller++;
        }


        input.close();
    }

}
