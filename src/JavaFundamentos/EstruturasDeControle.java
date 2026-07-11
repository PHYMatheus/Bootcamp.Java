package JavaFundamentos;

import java.util.Scanner;

public class EstruturasDeControle {
    public static void main(String[] args) {

        //DESAFIO

        Scanner sc = new Scanner(System.in);

        double salario = 1000.0;
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n === MENU CAIXA ===");
            System.out.println("1 - Verificar Saldo.");
            System.out.println("2 - Depositar Dinheiro");
            System.out.println("3 - Sacar Dinheiro");
            System.out.println("4 - Sair");

            System.out.println("\nSeu Saldo: " + salario);

            System.out.println("\nEscolha uma opcao: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Seu Saldo é: " + salario);
                    break;
                case 2:
                    System.out.println("Digite Valor para depositar: ");
                    double deposito = sc.nextDouble();
                    salario += deposito;
                    System.out.println("Saldo atual: " + salario);
                    break;
                case 3:
                    System.out.println("Digite Valor para sacar: ");
                    double sacar = sc.nextDouble();

                    if (salario >= sacar) {
                        salario -= sacar;
                        System.out.println("Saldo atual: " + salario);
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4:
                    System.out.println("Saindo..........");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}

