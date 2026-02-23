# Calculadora Maven

Projeto Java simples que implementa uma calculadora consola com operações de adição e subtração.

## Estrutura do Projeto

```
calculator/
├── pom.xml
└── src/
    ├── main/java/com/calculator/
    │   ├── Calculator.java    (lógica das operações)
    │   └── Main.java          (interface consola)
    └── test/java/com/calculator/
        └── CalculatorTest.java (testes unitários)
```

## Compilação

Para compilar o projeto com Maven:

```bash
mvn clean compile
```

## Execução

Para executar a aplicação:

```bash
mvn exec:java -Dexec.mainClass="com.calculator.Main"
```

Ou depois de compilar, gerar o JAR:

```bash
mvn clean package
java -jar target/calculator-1.0-SNAPSHOT.jar
```

## Testes

Para executar os testes unitários:

```bash
mvn test
```

## Requisitos

- Java 11 ou superior
- Maven 3.6 ou superior

## Funcionalidades

- ✓ Adição de dois números
- ✓ Subtração de dois números
- ✓ Interface interativa na consola
- ✓ Tratamento de erros de entrada
