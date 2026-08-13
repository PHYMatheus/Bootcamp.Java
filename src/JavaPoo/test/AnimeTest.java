package JavaPoo.test;

import JavaPoo.Exercicios.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Naruto", 360, "TV", "Ação", "Akira toriama");
        anime.imprimir();
    }
}
