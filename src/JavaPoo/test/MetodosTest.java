package JavaPoo.test;

import JavaPoo.Dominio.Metodos;

public class MetodosTest {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        metodos.somaDoisNumeros();
        metodos.subtraiDoisNumeros();
        System.out.println("\n");

        Metodos calculadora = new Metodos(); //Utilizando Metodos com Parâmetros
        calculadora.multiplicaDoisNumeros(7, 3); // <- Argumentos para o Metodo Funcionar!

        Metodos divisao = new  Metodos();
        double result = divisao.divideDoisNumeros(10,2); //Utilizando Parâmentros e Return nos Metodos!
        System.out.println(result); // <- Aqui utilizamos um metodo dentro de uma Variavél e imprimimos no Console.

    }
}
