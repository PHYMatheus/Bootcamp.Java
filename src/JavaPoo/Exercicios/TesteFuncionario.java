package JavaPoo.Exercicios;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setIdade(25);
        funcionario.setSalario(new double[]{1550.0, 800.0, 87.5});
        System.out.println("Média:" + funcionario.getMedia());
        funcionario.imprimir();
        funcionario.media();
    }
}
