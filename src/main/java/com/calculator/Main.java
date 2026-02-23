package com.calculator;

import java.util.Scanner;

/**
 * Aplicação consola para a calculadora
 * Permite ao utilizador realizar operações de adição e subtração
 */
public class Main {
    
    private static Calculator calculator = new Calculator();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║         CALCULADORA - 4 Operações       ║");
        System.out.println("╚════════════════════════════════════════╝");
        
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
                } else if (opcao == 3) {
                    realizarMultiplicacao();
                } else if (opcao == 4) {
                    realizarDivisao();
                } else {
                    System.out.println("❌ Opção inválida! Por favor, escolha 1, 2, 3, 4 ou 0.");
                }
            } catch (Exception e) {
                System.out.println("❌ Erro: entrada inválida!");
                scanner.nextLine(); // Limpar buffer
            }
        }
        
        scanner.close();
    }

    /**
     * Realiza uma operação de adição
     */
    private static void realizarAdicao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();
            
            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();
            
            double resultado = calculator.add(a, b);
            System.out.printf("\n✓ Resultado: %.2f + %.2f = %.2f\n", a, b, resultado);
        } catch (Exception e) {
            System.out.println("❌ Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    /**
     * Realiza uma operação de multiplicação sobre doubles
     */
    private static void realizarMultiplicacao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = calculator.multiply(a, b);
            System.out.printf("\n✓ Resultado: %.2f × %.2f = %.2f\n", a, b, resultado);
        } catch (Exception e) {
            System.out.println("❌ Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    /**
     * Realiza uma operação de divisão
     */
    private static void realizarDivisao() {
        try {
            System.out.print("Introduza o dividendo: ");
            double a = scanner.nextDouble();

            System.out.print("Introduza o divisor: ");
            double b = scanner.nextDouble();

            double resultado = calculator.divide(a, b);
            System.out.printf("\n✓ Resultado: %.2f ÷ %.2f = %.2f\n", a, b, resultado);
        } catch (ArithmeticException e) {
            System.out.println("❌ Erro: divisão por zero!");
        } catch (Exception e) {
            System.out.println("❌ Erro: entrada inválida!");
            scanner.nextLine();
        }
    }

    /**
     * Realiza uma operação de subtração
     * Realiza uma operação de subtração
     */
    private static void realizarSubtracao() {
        try {
            System.out.print("Introduza o primeiro número: ");
            double a = scanner.nextDouble();
            
            System.out.print("Introduza o segundo número: ");
            double b = scanner.nextDouble();
            
            double resultado = calculator.subtract(a, b);
            System.out.printf("\n✓ Resultado: %.2f - %.2f = %.2f\n", a, b, resultado);
        } catch (Exception e) {
            System.out.println("❌ Erro: entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }
}
