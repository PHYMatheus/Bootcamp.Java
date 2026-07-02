import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N)");
        var isEmacipated = scanner.next().equalsIgnoreCase("S");

        if (age >= 18) {
            System.out.println(name + " Você está Habilitado á Dirigir!");
        } else if (isEmacipated && age >= 16) {
            System.out.println(name + " Você é Emacipado +16 e pode Dirigir!");
        } else {
            System.out.println(name + " Não Habilitado á dirigir!");
        }

        System.out.println(name + " \n De 1 á 3 quanto de experiência você tem em Dirigir?");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Muita Experiência!");
                    break;
                case 2:
                    System.out.println("Experiência intermediária!");
                    break;
                case 3:
                    System.out.println("Nenhuma Experiência!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


            System.out.println(name + " \n Qual dia da Semana desse Formulário?");
        System.out.println("1 Domingo, 2 Segunda, 3 Terça, 4 Quarta, 5 Quinta, 6 Sexta, 7 Sábado");

            int day = scanner.nextInt();
            switch (day) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda");
                case 3 -> System.out.println("Terça");
                case 4 -> System.out.println("Quarta");
                case 5 -> System.out.println("Quinta");
                case 6 -> System.out.println("Sexta");
                case 7 -> System.out.println("Sábado");
                default -> System.out.println("Opção inválida!");
            }
    }
}
