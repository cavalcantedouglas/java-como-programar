package org.example.capitulo04.exercises;

import java.util.Scanner;

public class CalculadorDeComissaoDeVendas {

    /**
     * Calculador de Comissão de Vendas
     *
     * Pessoal de Vendas = R$ 200,00/semana + 9% de Comissao das vendas brutas desse período (semana).
     *  Itens vendidos
     *
     *  item | valor
     *  1 | 239.99
     *  2 | 129.75
     *  3 | 99.95
     *  4 | 350.89
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao Programa de Calculo de Comissão de vendas.");
        System.out.print("Por favor insira no nome do Vendedor: ");
        String vendedor = input.next();
        int item = 0;
        double valor = 0;
        double valorTotal = 0;
        final double PERCENTUAL = 9;
        final double SALARIOFIXO= 200;
        System.out.println("Insira os valores 1, 2, 3 ou 4. Ou -1 para sair do programa.");

        while (item != -1) {
            System.out.print("Insira o produto vendido: ");
            item = input.nextInt();

            if (item == 1) {
                valor = 239.99;
                System.out.printf("O produto %d: R$ %.2f%n", item ,valor);
            }
            if (item == 2) {
                valor = 129.75;
                System.out.printf("O produto %d: R$ %.2f%n", item ,valor);
            }
            if (item == 3) {
                valor = 239.99;
                System.out.printf("O produto %d: R$ %.2f%n", item ,valor);
            }
            if (item == 4) {
                valor = 239.99;
                System.out.printf("O produto %d: R$ %.2f%n", item ,valor);
            }

            valorTotal += valor;

        }

        System.out.printf("O vendedor %s vendeu o total de: R$ %.2f%n", vendedor, valorTotal);
        System.out.println("Calculando comissão...");
        double resultado = (PERCENTUAL / 100) * valorTotal;
        System.out.printf("Comissäo de: R$%.2f%n", resultado);

        double salarioSemanal = SALARIOFIXO + resultado;

        System.out.printf("O vendedor %s receberá: R$%.2f esta semana.", vendedor, salarioSemanal);

        input.close();
    }


}
