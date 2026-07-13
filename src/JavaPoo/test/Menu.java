package JavaPoo.test;

import JavaPoo.Pessoa;

public class Menu {
    public static void main(String[] args) {

        Pessoa aluno = new Pessoa();
            aluno.nome = "Luffy";
            aluno.idade = 24;
            aluno.sexo = 'M';

        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);

    }
}
