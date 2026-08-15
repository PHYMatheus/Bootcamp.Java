package JavaPoo.Classes;

public class Calculadora {

    public void calcular(int numberOne, int numberTwo) {
        numberOne = 99;
        numberTwo = 33;

        System.out.println("Dentro do Calcular");
        System.out.println(numberOne);
        System.out.println(numberTwo);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //METODO VARARGS
    public void varArgs(int... numeros1){  // <- sintaxe para simplificar.
        int soma1 = 0;
        for(int num1 : numeros1){
            soma1 += num1;
        }
        System.out.println(soma1);
    }

}
