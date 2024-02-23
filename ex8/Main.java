package ex8;

/*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Livro - O Grande Gatsby");
        produto1.setPreco(40.50);

        System.out.println("---------------------------");
        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Valor antes do desconto: " + produto1.getPreco());
        produto1.aplicarDesconto(50);
        System.out.println("Valor depois do desconto: " + produto1.getPreco());
    }
}
