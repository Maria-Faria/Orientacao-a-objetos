package ex6;

/*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para
os atributos privados.*/
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(123456);
        conta1.setSaldo(12356.25);
        conta1.titular = "Maria Eduarda de Faria";

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo disponível: R$" + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);
    }
}
