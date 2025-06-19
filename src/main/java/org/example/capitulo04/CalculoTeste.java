package org.example.capitulo04;

public class CalculoTeste {

    public static void main(String[] args) {

        int x =1, total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n: ", total);

    }
}
