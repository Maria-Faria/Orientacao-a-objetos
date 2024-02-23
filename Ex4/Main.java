package Ex4;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Hilux";
        carro1.cor = "Cinza";
        carro1.ano = 2023;

        carro1.exibeFicha();

        System.out.println("\nIdade do carro em anos: " + carro1.idade());

    }
}
