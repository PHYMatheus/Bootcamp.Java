package JavaFundamentos;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        //OPERADORES EXERCICIOS GERAIS//

        int n1 = 10;
        int n2 = 20;

        int soma = n1 + n2;
        System.out.println(soma);
        int multiplicacao = n1 * n2;
        System.out.println(multiplicacao);
        double divisao = n1 / (double) n2;  //casting//
        System.out.println(divisao);
        int resto = n1 % n2;
        System.out.println(resto);

        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        int media = nota1 + nota2 + nota3/ 3;
        System.out.println("Media das Notas: " + media);

        int idade = 18;
        int isConvercaoDeAnosParaMeses = idade*12;
        System.out.println("Idade de Anos Para meses é: " + isConvercaoDeAnosParaMeses + " Meses");


        int idade1 = 17;
        boolean isAutenticarIdade = idade1 >= 18;
        System.out.println("É Maior ou Tem 18 Anos? " + isAutenticarIdade);

        int numero1 = 20;
        int numero2 = 60;

        boolean isSaoIguais = (numero1 == numero2);
        System.out.println("São iguais? " + isSaoIguais);

        boolean isfirst = (numero1 > numero2);
        System.out.println("O Primeiro é Maior?" + (isfirst));

        boolean isSegundoMaior = (numero2 > numero1);
        System.out.println("O Segundo é Maior?" + (isSegundoMaior));

        //****************************************************************************//

        // EXERCICIO 1 //

        var yearAtual = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
            var name = scanner.nextLine();
        System.out.println("Qual ano de Nascimento? ");
            var year = scanner.nextInt();

            int yearNasc = (yearAtual - year);

        System.out.println(name + " sua Idade é: " +  yearNasc);

        // EXERCICO 2 //

            Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite o Primeiro Lado: ");
        int first = scanner2.nextInt();
        System.out.println("Digite o Segundo Lado: ");
        int second = scanner2.nextInt();

        int square = (first * second);
        System.out.println("A área do quadrado é igual a: " + square);


        // EXERCICIO 3 //

            Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite a Base");
        int base = sc1.nextInt();
        System.out.println("Digite a Altura");
        int heigth = sc1.nextInt();

            int rectangle = base*heigth;

        System.out.println("Á área do Retangulo é igual á: " + rectangle);

        // EXERCICIO 4 //

        Scanner sc2 = new Scanner(System.in);

        System.out.println("======== PESSOA 1 =========");
        System.out.println("Digite seu nome: ");
        String nameOne = sc2.nextLine();
        System.out.println("Digite sua idade: ");
        int age = sc2.nextInt();

        System.out.println("======== PESSOA 2 =========");
        System.out.println("Digite seu nome: ");
        String nametwo = sc2.nextLine();
        System.out.println("Digite sua idade: ");
        int agetwo = sc2.nextInt();

        int different = agetwo - age;

        System.out.println("Diferança de Idade: " + different);



    }
}