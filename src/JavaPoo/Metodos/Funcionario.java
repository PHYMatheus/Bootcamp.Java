package JavaPoo.Metodos;

public class Funcionario {

    private String nome;
    private int idade;
    private double [] salario;
    private double media;

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public double[] getSalario() {return salario;}
    public double getMedia() {return media;}
    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setSalario(double[] salario) {this.salario = salario;}

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double salario: salario){
            System.out.println("Salário: " + " R$ " + salario);
        }
    }

    public void media() {
        double media = 0;
        for(double salario: salario){
            media += salario;
        }
        media = media /salario.length;
        System.out.println("Media Salárial: " + media);
    }
}
