package org.example.capitulo04.exercises;

import java.util.Scanner;

// Exercicio 4.35 - Lados de Um Triangulo
public class LadosDeUmTriangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o lado A do triangulo: ");
        int a = input.nextInt();
        System.out.print("Insira o lado B do triangulo: ");
        int b = input.nextInt();
        System.out.print("Insira o lado C do triangulo: ");
        int c = input.nextInt();

        if (a <= 0 || b <=0 || c <= 0) System.out.println("Os lados do triangulo devem ser maiores que 0");
        else if (a + b > c && b + c > a && c + a > b) System.out.println("É um triangulo");
        else System.out.println("Não é um triangulo");


        input.close();

    }
}
