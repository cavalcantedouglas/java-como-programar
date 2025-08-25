package org.example.capitulo04.exercises;

import java.util.Scanner;

// Exercicio 4.36 - Lados de Um Triangulo Direito
public class LadosDeUmTrianguloDireito {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Insira o lado A do triangulo: ");
            int a = input.nextInt();
            System.out.print("Insira o lado B do triangulo: ");
            int b = input.nextInt();
            System.out.print("Insira o lado C do triangulo: ");
            int c = input.nextInt();

            if (a <= 0 || b <=0 || c <= 0) System.out.println("Os lados do triangulo devem ser maiores que 0");
            else if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) System.out.println("É um triangulo direito");
            else System.out.println("Não é um triangulo direito");


            input.close();

        }

}
