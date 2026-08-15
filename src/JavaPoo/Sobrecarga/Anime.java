package JavaPoo.Sobrecarga;

public class Anime {

    private String nome;
    private int episodios;
    private String tipo;
    private String genero;
    private String empresa;
    private int ano;

    // Utilizando um Construtor.
    public Anime(String nome, int episodios, String tipo, String genero, String empresa) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;
        this.empresa = empresa;
    }
    // Sobrecarga de Construtor.
    public Anime(String nome, int episodios, String tipo, String genero, String empresa, int ano) {
        this(nome,episodios,tipo,genero,empresa);
        this.ano = ano;
    }

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
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Tipo: " + this.tipo);
    }
}
