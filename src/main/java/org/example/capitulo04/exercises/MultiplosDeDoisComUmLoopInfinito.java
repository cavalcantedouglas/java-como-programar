package org.example.capitulo04.exercises;

// Exercicio 4.33 - Multiplos de Dois Com Um Loop Infinito.
public class MultiplosDeDoisComUmLoopInfinito {

    public static void main(String[] args) {
        long x = 1L;
        while (x > 0) {
            x *= 2;
            System.out.println(x);
        }
    }

    // O que acontece quando executa esse programa?
    // Depois que passa do valor de 1 tera, o valor fica negativo. Pode ser uma limitacao do int?
    // Sim, era uma limitacao do int, com o long deu um numero muito maior antes de ficar negativo.
    // Isso acontece por que exatamente? Penso que quando o numero bate no "teto" de numero inteiro positivo, o proximo
    // numero é o menor negativo?

    // Com um pouco de pesquisa entendi que o nome desse fenomeno é estouro aritmetico e o raciocinio de "teto" para um
    // para um valor inteiro dos tipos primitivos estava no caminho certo. E o programa encerra porque como o numero passa
    // a ser negativo a condicao do while se torna falsa.

    // Para contornar esse problema de estouro aritmetico o java fornece as classes BigInteger e BigDecimal no pacote
    // java.math.

}
