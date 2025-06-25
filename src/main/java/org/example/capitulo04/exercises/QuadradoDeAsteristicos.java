package org.example.capitulo04.exercises;

// Exercicio 4.29 - Criar um quadrado vazio de asterísticos.

import java.util.Scanner;

public class QuadradoDeAsteristicos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nessa variavel lado, atribuo o valor de lado atraves do console.
        int lado = input.nextInt();

        // Dois controllers para guiar os lacoes de repeticao while
        int controller = 1;
        int controllerLado = 1;

        // Primeira verificacao. Caso o valor seja maior que 1 vai para o else onde imprime apenas 1 asteristico
        if (lado > 1) {
            // Imrpime o topo do quadrado
            while(controller <= lado) {
                System.out.print("*");
                controller++;
            }
            // Aqui pula uma linha e seta o valor do controller de novo para 1
            System.out.println();
            controller = 1;
            // Com o controller em 1 de novo ele entra dentro desse laco if
            if(controller == 1) {
                // Esse while vai imprimir o lado esquerdo do quadrado. Coloquei lado -2, porque estou descontando o topo e a base.
                while (controller <= lado -2) {
                    System.out.print("*");
                    // Esse if aqui é pra forcar o laco de repeticao while logo abaixo, porquye esse outro while é responsavel por colocar espacos entre os asteristicos do quadrado.
                    if(controller != lado) {
                        controllerLado = 1;
                        while (controllerLado <= lado -2) {
                            System.out.print(" ");
                            controllerLado++;
                        }
                    }
                    // Aqui finaliza a primeira linha com espacos em branco e o laco se repete até a quantidade que foi definida na variavel lado do inicio do programa
                    System.out.println("*");
                    controller++;
                }
            }
            // Novamente setando o controller para 1 e imprimindo a base
            controller = 1;
            while(controller <= lado) {
                System.out.print("*");
                controller++;
            }
        } else System.out.println("*");



        // imrpimir os lados. eles precisam ser impressos no primeiro * e no ultimo, o entre é espaco em branco.
        // preciso contar -2 por ja ter a base e o topo. seria algo como controller <= lado -2? pra imprimir a linha lateral

        input.close();
    }
}
