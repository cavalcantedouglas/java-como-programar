package org.example.cap4InstrucoesDeControle.exercises;

/**
 * Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
 * as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
 * horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
 * programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
 * Utilize a classe Scanner para inserir os dados.
 */

import java.util.Scanner;

    public class CalculadorDeSalarios {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            Employee employee1 = new Employee("Douglas",40, 50);
            Employee employee2 = new Employee("Andressa", 50, 50);
            Employee employee3 = new Employee("Patricia", 35, 50);

            employee1.calcularSalarioBruto();
            employee2.calcularSalarioBruto();
            employee3.calcularSalarioBruto();

            System.out.printf("O funcionario %s trabalho por %d horas esta semana e recebeu R$%.2f%n",
                    employee1.getNome(), employee1.getHorasTrabalhadas(), employee1.calcularSalarioBruto());
            System.out.printf("O funcionario %s trabalho por %d horas esta semana e recebeu R$%.2f%n",
                    employee2.getNome(), employee2.getHorasTrabalhadas(), employee2.calcularSalarioBruto());
            System.out.printf("O funcionario %s trabalho por %d horas esta semana e recebeu R$%.2f%n",
                    employee3.getNome(), employee3.getHorasTrabalhadas(), employee3.calcularSalarioBruto());


            input.close();
        }

    }

    class Employee {
        private String nome;
        private int horasTrabalhadas;
        private double salarioHora;

        public double calcularSalarioBruto() {
            double salarioBruto = salarioHora * horasTrabalhadas;
            if( horasTrabalhadas <= 40) {
                return salarioBruto;
            } else {
                int horasRegulares = 40;
                int horaExtra = horasTrabalhadas - horasRegulares;
                double valorHoraExtra = 0.5 * salarioHora;
                double calculoHoraExtra = horaExtra * valorHoraExtra;
                return salarioBruto + calculoHoraExtra;
            }
        }

        public Employee() {
        }

        public Employee(String nome, int horasTrabalhadas, double salarioHora) {
            this.nome = nome;
            this.horasTrabalhadas = horasTrabalhadas;
            this.salarioHora = salarioHora;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }

        public void setHorasTrabalhadas(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }

        public double getSalarioHora() {
            return salarioHora;
        }

        public void setSalarioHora(double salarioHora) {
            this.salarioHora = salarioHora;
        }
    }
