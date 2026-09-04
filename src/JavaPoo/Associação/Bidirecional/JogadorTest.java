package JavaPoo.Associação.Bidirecional;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brazil");

        Jogador [] jogadores = {jogador};

        time.setJogadores(jogadores);

        System.out.println("--- JOGADOR ---");
        jogador.imprimir();
        System.out.println("--- TIME ---");
        time.imprime();
    }
}
