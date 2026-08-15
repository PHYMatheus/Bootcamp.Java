package JavaPoo.Associação.MuitosParaUm;

public class Escola {

    private Professor [] professores;
    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }
    public Escola(String nome, Professor [] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println(this.nome);
            if(professores == null) return;
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
    }
}
