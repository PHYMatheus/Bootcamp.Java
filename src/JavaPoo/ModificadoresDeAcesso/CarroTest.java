package JavaPoo.ModificadoresDeAcesso;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Mercedez", 300);
        Carro carro2 = new Carro("BMW", 240);
        Carro carro3 = new Carro("FERRARI", 275);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
