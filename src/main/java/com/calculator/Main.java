package com.calculator;

import java.util.Scanner;

/**
 * Aplicação consola para a calculadora.
 */
public final class Main {

    /** Opção do menu para multiplicação. */
    private static final int OPT_MULTIPLY = 3;

    /** Opção do menu para divisão. */
    private static final int OPT_DIVIDE = 4;

    /** Instância da calculadora. */
    private static Calculator calculator = new Calculator();

    /** Scanner para leitura de input. */
    private static Scanner scanner = new Scanner(System.in);

    private Main() {
    }

    /**
     * Ponto de entrada da aplicação.
     * @param args argumentos da linha de comandos
     */
    public static void main(final String[] args) {
        System.out.println(
            "╔════════════════════════════════════════╗");
        System.out.println(
            "║       CALCULADORA - 4 Operações        ║");
        System.out.println(
            "╚════════════════════════════════════════╝");

        boolean continuar = true;

        while (continuar) {
            try {
                // Menu
                System.out.println("\nEscolha uma operação:");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("0 - Sair");
                System.out.print("\nOpção: ");

                int opcao = scanner.nextInt();

                if (opcao == 0) {
                    System.out.println("\nAté à vista!");
                    continuar = false;
                } else if (opcao == 1) {
                    realizarAdicao();
                } else if (opcao == 2) {
                    realizarSubtracao();
                } else if (opcao == OPT_MULTIPLY) {
                    realizarMultiplicacao();
                } else if (opcao == OPT_DIVIDE) {
                    realizarDivisao();
                } else {
                    System.out.println(
                        "Opção inválida! Escolha 1, 2, 3, 4 ou 0."
                    );
                }
            } catch (Exception e) {
                System.out.println("Erro: entrada inválida!");
                scanner.nextLine(); // Limpar buffer
            }
        }

        scanner.close();
    }

    /**
     * Realiza uma operação de adição.
     */
    private static void realizarAdicao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = calculator.add(a, b);
            System.out.printf(
                "\nResultado: %.2f + %.2f = %.2f\n",
                a, b, resultado);
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    /**
     * Realiza uma operação de multiplicação.
     */
    private static void realizarMultiplicacao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = calculator.multiply(a, b);
            System.out.printf(
                "\nResultado: %.2f × %.2f = %.2f\n",
                a, b, resultado);
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    /**
     * Realiza uma operação de divisão.
     */
    private static void realizarDivisao() {
        try {
            System.out.print("Introduza o dividendo: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o divisor: ");
            double b = scanner.nextDouble();

            double resultado = calculator.divide(a, b);
            System.out.printf(
                "\nResultado: %.2f ÷ %.2f = %.2f\n",
                a, b, resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
            scanner.nextLine();
        }
    }

    /**
     * Realiza uma operação de subtração.
     */
    private static void realizarSubtracao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = calculator.subtract(a, b);
            System.out.printf(
                "\nResultado: %.2f - %.2f = %.2f\n",
                a, b, resultado);
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }
}
