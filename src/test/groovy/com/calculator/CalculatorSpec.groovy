package com.calculator

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {

    Calculator calculator = new Calculator()

    // --- Addition ---

    def "should add two positive numbers"() {
        expect:
        calculator.add(2, 3) == 5
    }

    def "should add two negative numbers"() {
        expect:
        calculator.add(-2, -3) == -5
    }

    def "should add positive and negative number"() {
        expect:
        calculator.add(5, -3) == 2
    }

    def "should add zero to a number"() {
        expect:
        calculator.add(7, 0) == 7
    }

    @Unroll
    def "should add #a + #b = #expected"() {
        expect:
        calculator.add(a, b) == expected

        where:
        a     | b     || expected
        1.5   | 2.5   || 4.0
        0.1   | 0.2   || 0.30000000000000004  // floating point
        100   | 200   || 300
        -10   | 10    || 0
    }

    // --- Subtraction ---

    def "should subtract two positive numbers"() {
        expect:
        calculator.subtract(10, 3) == 7
    }

    def "should subtract resulting in negative number"() {
        expect:
        calculator.subtract(3, 10) == -7
    }

    def "should subtract zero from a number"() {
        expect:
        calculator.subtract(5, 0) == 5
    }

    @Unroll
    def "should subtract #a - #b = #expected"() {
        expect:
        calculator.subtract(a, b) == expected

        where:
        a     | b     || expected
        10.5  | 0.5   || 10.0
        -5    | -3    || -2
        0     | 0     || 0
        100   | 100   || 0
    }

    // --- Multiplication ---

    def "should multiply two positive numbers"() {
        expect:
        calculator.multiply(4, 5) == 20
    }

    def "should multiply by zero"() {
        expect:
        calculator.multiply(7, 0) == 0
    }

    def "should multiply by negative number"() {
        expect:
        calculator.multiply(3, -4) == -12
    }

    def "should multiply two negative numbers"() {
        expect:
        calculator.multiply(-3, -4) == 12
    }

    @Unroll
    def "should multiply #a * #b = #expected"() {
        expect:
        calculator.multiply(a, b) == expected

        where:
        a     | b     || expected
        1.5   | 2.0   || 3.0
        -1    | 1     || -1
        0     | 0     || 0
        100   | 0.01  || 1.0
    }

    // --- Division ---

    def "should divide two positive numbers"() {
        expect:
        calculator.divide(10, 2) == 5
    }

    def "should divide resulting in decimal"() {
        expect:
        calculator.divide(7, 2) == 3.5
    }

    def "should divide negative by positive"() {
        expect:
        calculator.divide(-10, 2) == -5
    }

    def "should divide zero by a number"() {
        expect:
        calculator.divide(0, 5) == 0
    }

    def "should throw ArithmeticException when dividing by zero"() {
        when:
        calculator.divide(10, 0)

        then:
        def e = thrown(ArithmeticException)
        e.message == "Divisão por zero"
    }

    @Unroll
    def "should divide #a / #b = #expected"() {
        expect:
        calculator.divide(a, b) == expected

        where:
        a     | b     || expected
        10.0  | 2.5   || 4.0
        -10   | -2    || 5
        100   | 10    || 10
        1     | 3     || 0.3333333333333333
    }
}
