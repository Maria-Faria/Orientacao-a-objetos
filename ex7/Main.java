package ex7;

/*Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/
public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Maria Eduarda");
        pessoa1.setIdade(19);
        pessoa1.verificarIdade();

        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa2.setNome("José Freitas");
        pessoa2.setIdade(15);
        pessoa2.verificarIdade();
    }
}
