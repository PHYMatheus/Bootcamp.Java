package JavaFundamentos;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {

        //DESAFIO 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
          int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int calcular = number * i;
            System.out.println(number + " x " + i + " = " + calcular);
        }

        //DESAFIO 2

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Digite seu peso: ");

        if (!scanner1.hasNextDouble()) {
            System.out.println("Peso inválido.");
            return;
        }

        double peso = scanner1.nextDouble();

        System.out.print("Digite sua altura: ");

        if (!scanner1.hasNextDouble()) {
            System.out.println("Altura inválida.");
            return;
        }

        double altura = scanner1.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero.");
            return;
        }

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
        scanner1.close();
        }
    }

