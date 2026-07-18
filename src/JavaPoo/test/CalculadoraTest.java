package JavaPoo.test;

import JavaPoo.Dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int numberOne = 1;
        int numberTwo = 2;
        calculadora.calcular(numberOne, numberTwo);
        System.out.println(numberOne);
        System.out.println(numberTwo);

        Calculadora calculadora2 = new Calculadora();

        int [] numeros = {1,2,3,4,5};
        calculadora2.somaArray(numeros);
        calculadora2.varArgs(1,2,3,4,5); // <- Usando VarArgs para Simplificar.

    }
}
