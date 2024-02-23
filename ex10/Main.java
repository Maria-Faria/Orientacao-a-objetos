package ex10;

/*Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.*/
public class Main {
    public static void main(String[] args) {
        Livro livor1 = new Livro();

        livor1.setTitulo("A Casa Torta");
        livor1.setAutor("Agatha Christie");

        livor1.exibirDetalhes();
    }
}
