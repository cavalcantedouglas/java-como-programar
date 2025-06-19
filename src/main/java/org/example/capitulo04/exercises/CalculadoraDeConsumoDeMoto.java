package org.example.capitulo04.exercises;

import java.util.Scanner;

public class CalculadoraDeConsumoDeMoto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int viagem = 0;
        int km = 0;
        int litros = 0;
        double kmPorLitros = 0;
        int saida = 0;


        while (saida != -1) {
            System.out.println("Insira os dados da sua viagem");

            System.out.print("Quantos Km rodou nessa viagem: ");
            km = input.nextInt();

            System.out.print("Quantos Litros de gasolina consumiu nessa viagem: ");
            litros = input.nextInt();

            kmPorLitros = (double) km / litros;
            viagem++;
            System.out.printf("Voce consumiu %.2f Km/L na viagem %d%n", kmPorLitros, viagem);


            System.out.println("Se quiser calcular os dados de outra viagem insira 1, se quiser encerrar o programa insira -1");
            saida = input.nextInt();

        }
        double mediaTotal = kmPorLitros / viagem;

        System.out.printf("A media total das %d viagens é de %.2f Km/L",viagem, mediaTotal);


        input.close();

    }
}
