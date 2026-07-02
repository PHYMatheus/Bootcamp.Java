package JavaFundamentos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {

        String nome = "Matheus";
        String endereco = "Livramento";
        double salario = 5000;
        String data = "09/06/2026";

        System.out.println("Eu " + nome + " Morando no endereço " + endereco +
                " confirmo que recebi o Salario " + salario + " ,na data " + data);

        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var result = scanner.nextLine();
        System.out.println("Digite seu Salario: ");
        var result2 = scanner.nextLine();
        System.out.println("Digite sua data: ");
        var result3 = scanner.nextLine();
        System.out.println("Digite seu Endereço: ");
        var result4 = scanner.nextLine();


        System.out.println("Nome: " + result + " Salario: " + result2 + " Data: " + result3 + " Seu Endereço: " + result4);
    }
}