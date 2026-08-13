package JavaPoo.Exercicios;

public class Anime {

    private String nome;
    private int episodios;
    private String tipo;
    private String genero;
    private String empresa;

    public void setNomeAnime(String nome){this.nome = nome;}
    public String getNomeAnime(){return this.nome;}
    public void setEpisodios(int episodios){this.episodios = episodios;}
    public int getEpisodios(){return this.episodios;}
    public void setTipo(String tipo){this.tipo = tipo;}
    public String getTipo(){return this.tipo;}
    public String getGenero(){return this.genero;}
    public void setGenero(String genero){this.genero = genero;}
    public String getEmpresa(){return this.empresa;}
    public void setEmpresa(String empresa){this.empresa = empresa;}

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Tipo: " + this.tipo);
    }

    public void init(String nome, int episodios, String tipo, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    // Aqui utilizando a Sobrecarga de método para adicionar um Atributo no Método.
    public void init(String nome, int episodios, String tipo, String genero, String empresa){
        init(nome, episodios, tipo, genero);
        this.empresa = empresa;
    }


}
