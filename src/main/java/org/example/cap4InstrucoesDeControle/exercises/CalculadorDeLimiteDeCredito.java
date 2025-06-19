package org.example.cap4InstrucoesDeControle.exercises;

import java.util.Scanner;

public class CalculadorDeLimiteDeCredito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        int saida = 0;

        while (saida != -1 ) {

            System.out.println("Bem vindo ao programa de calculo de limite de crédito. Por favor, insira seus dados");
            System.out.print("Qual o numero de sua conta: ");
            cliente.setNumeroConta(input.nextInt());

            System.out.print("Insira saldo da sua conta no inico do mes: ");
            cliente.setSaldoInicioMes(input.nextInt());

            System.out.print("Insira o total de despesas desse mes: -");
            cliente.setTotalItensCobradosMes(input.nextInt());

            System.out.print("Insire o limite de crédito de sua conta: ");
            cliente.setLimiteCreditoAutorizado(input.nextInt());

            int saldoMensal = cliente.getSaldoInicioMes() - cliente.getTotalItensCobradosMes();
            int novoSaldoMensal = cliente.getLimiteCreditoAutorizado() + saldoMensal;
            System.out.printf("O saldo de sua conta é: %d%n", novoSaldoMensal);

            if (saldoMensal < 0) {
                System.out.printf("O cliente número da conta: %d entrou no cheque especial, isso pode acarretar juros.%n", cliente.getNumeroConta());
                int creditoUsado = cliente.getLimiteCreditoAutorizado() - novoSaldoMensal;
                System.out.printf("Voce utilizou %d do seu limite de crédito.%n", creditoUsado);
            }

            if (novoSaldoMensal < 0)
                System.out.printf("O cliente numero da conta: %d, excedeu o limite de credito%n", cliente.getNumeroConta());


            System.out.println("Para sair do programa basta digitar -1");
            saida = input.nextInt();
        }
        System.out.println("Fim do programa");
        input.close();
    }

    public static class Cliente {
        private int numeroConta;
        private int saldoInicioMes;
        private int totalItensCobradosMes;
        private int limiteCreditoAutorizado;

        public Cliente() {
        }

        public Cliente(int numeroConta, int saldoInicioMes, int totalItensCobradosMes, int limiteCreditoAutorizado) {
            this.numeroConta = numeroConta;
            this.saldoInicioMes = saldoInicioMes;
            this.totalItensCobradosMes = totalItensCobradosMes;
            this.limiteCreditoAutorizado = limiteCreditoAutorizado;
        }


        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public int getSaldoInicioMes() {
            return saldoInicioMes;
        }

        public void setSaldoInicioMes(int saldoInicioMes) {
            this.saldoInicioMes = saldoInicioMes;
        }

        public int getTotalItensCobradosMes() {
            return totalItensCobradosMes;
        }

        public void setTotalItensCobradosMes(int totalItensCobradosMes) {
            this.totalItensCobradosMes = totalItensCobradosMes;
        }

        public int getLimiteCreditoAutorizado() {
            return limiteCreditoAutorizado;
        }

        public void setLimiteCreditoAutorizado(int limiteCreditoAutorizado) {
            this.limiteCreditoAutorizado = limiteCreditoAutorizado;
        }
    }
}
