package JavaFundamentos;

public class Arrays {
    public static void main(String[] args) {

        //DESAFIO 1

        double[] compras = new double[]{150.50, 49.90, 320.0, 15.0, 85.0};

        double valorTotal = 0.0;

        for (double compra : compras) {
            valorTotal += compra;
        }

        double mediaDeCompras = valorTotal / compras.length;

        System.out.println(" === RELATÓRIO DE COMPRAS ===");
        System.out.printf("Valor em Média de Compras %.2f\n", mediaDeCompras);
        System.out.printf("Valor Total de Compras %.2f\n", valorTotal);


        System.out.println("-------------------------------------------------------");


        //DESAFIO 2

                String[] disciplinas = {"Matemática", "Português", "História"};

                double[][] notas = {
                        {8.0, 7.5, 9.0},
                        {6.0, 6.5, 8.0},
                        {9.5, 9.0, 10.0}
                };

                System.out.println("--- MÉDIAS POR DISCIPLINA ---");

                for (int i = 0; i < notas.length; i++) {
                    double somaNotas = 0.0;

                    for (int j = 0; j < notas[i].length; j++) {
                        somaNotas += notas[i][j];
                    }

                    double mediaFinal = somaNotas / notas[i].length;

                    System.out.printf("%s: Média Final = %.2f%n", disciplinas[i], mediaFinal);
                }
    }
}
