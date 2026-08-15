package JavaPoo.Associação.MuitosParaUm;

public class EscolaTest {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor professor3 = new Professor("Orochimaru Sensei");
        Professor [] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Konoha University", professores);
        escola.imprimir();
    }
}
