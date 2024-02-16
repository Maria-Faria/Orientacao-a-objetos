package Ex3;

public class Musica {
    String titulo, artista;
    int anoLancamento, avaliacao, numAvaliacoes = 0, somaAvaliacoes = 0;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }
    void exibeFicha() {
        System.out.println("***** Ficha técnica ****");
        System.out.println("Música: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("*************************");
    }

    int avaliarMusica(int avaliacao) {
        this.numAvaliacoes++;
        this.somaAvaliacoes += avaliacao;

        return this.avaliacao = avaliacao;
    }

    double mediaAvaliacoes() {
        return (double) this.somaAvaliacoes /this.numAvaliacoes;
    }
}
