package JavaPoo.ModificadoresDeAcesso;

public class Carro {

    private String modelo;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Modelo: " + this.modelo );
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima );
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public double getVelocidadeMaxima() {return velocidadeMaxima;}
    public void setVelocidadeMaxima(double velocidadeMaxima) {velocidadeMaxima = velocidadeMaxima;}
}
