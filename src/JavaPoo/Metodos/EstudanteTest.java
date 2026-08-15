package JavaPoo.Metodos;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Pedro";
        estudante.sexo = 'M';
        estudante.idade = 18;

        estudante2.sexo = 'F';
        estudante2.nome = "Jiraya";
        estudante2.idade = 79;

        estudante.imprime();
        estudante2.imprime();

    }
}
