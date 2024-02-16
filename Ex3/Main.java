package Ex3;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Firework", "Katy Perry", 2010);

        musica1.exibeFicha();
        System.out.println("Avaliando a música " + musica1.titulo + " com a nota: " + musica1.avaliarMusica(10));
        System.out.println("\nMédia de avaliações: " + musica1.mediaAvaliacoes());

        Musica musica2 = new Musica("Memórias", "Malta", 2014);

        System.out.println();
        musica2.exibeFicha();
        System.out.println("Avaliando a música " + musica2.titulo + " com a nota: " + musica2.avaliarMusica(10));
        System.out.println("Avaliando a música " + musica2.titulo + " com a nota: " + musica2.avaliarMusica(8));
        System.out.println("Avaliando a música " + musica2.titulo + " com a nota: " + musica2.avaliarMusica(5));

        System.out.println(String.format("\nMédia de avaliações: %.2f", musica2.mediaAvaliacoes()));

    }
}
