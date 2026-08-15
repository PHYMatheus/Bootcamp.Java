package JavaPoo.Metodos;

public class Metodos {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    //Metodos com Parâmetros.
    public void multiplicaDoisNumeros(int number, int numberTwo){
        System.out.println(number*numberTwo);
    }

    //Metodos com Retorno.
    public double divideDoisNumeros(double numberOne, double TwoNumber){
        if(numberOne < TwoNumber){
            return 0;
        } else if(TwoNumber == 0){
            return  numberOne;
        }
        return numberOne / TwoNumber;
    }
}
