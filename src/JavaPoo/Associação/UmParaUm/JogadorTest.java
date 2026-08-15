package JavaPoo.Associação.UmParaUm;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("Barcelona");
        jogador.setTime(time);
        jogador.imprimir();
    }
}
