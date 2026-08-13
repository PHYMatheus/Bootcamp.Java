package JavaPoo.test;

import JavaPoo.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Matheus");
        pessoa.setIdade(24);
        pessoa.imprimir();

    }
}
