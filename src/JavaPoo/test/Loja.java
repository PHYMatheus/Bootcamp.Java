package JavaPoo.test;

import JavaPoo.Dominio.Carro;

public class Loja {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
            carro1.nome = "CIVIC";
            carro1.modelo = "XRL";
            carro1.ano = 2011;
            
        Carro carro2 = new Carro();
            carro2.modelo = "GTI";
            carro2.ano = 2020;
            carro2.nome = "GOLF";

        System.out.println("=== CARRO 1 ===");    
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("=== CARRO 2 ===");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
