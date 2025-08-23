package org.example.capitulo04.exercises;

// Exercicio 4.34 - O que há de com esse codigo
public class OQueHaDeErradoComEsseCodigo {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
//        O que há de errado com a seguinte instrução? Forneça a instrução correta para adicionar 1 à soma de x + y.
//        System.out.println( ++(x + y));

//        O ++ é um operador de pré incremeto unário, ou seja, ele precisa de uma variável para realizar a operação.
//        Para adicionar +1 ã operação de x+y, troquei o operador unário para uma soma normal de +1.

        System.out.println(1 + (x + y));

    }
}
