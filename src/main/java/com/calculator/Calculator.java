package com.calculator;

/**
 * Classe que implementa operações matemáticas básicas.
 */
public class Calculator {

    /**
     * Construtor padrão da classe Calculator.
     */
    public Calculator() { }

    /**
     * Realiza a adição de dois números.
     * @param a o primeiro número
     * @param b o segundo número
     * @return o resultado da adição
     */
    public double add(final double a, final double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     * @param a o primeiro número (minuendo)
     * @param b o segundo número (subtração)
     * @return o resultado da subtração
     */
    public double subtract(final double a, final double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     * @param a o primeiro número
     * @param b o segundo número
     * @return o resultado da multiplicação
     */
    public double multiply(final double a, final double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     * @param a o dividendo
     * @param b o divisor
     * @return o resultado da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
