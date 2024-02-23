package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        sc.close();

        Calculadora c1 = new Calculadora();

        System.out.println(String.format("O dobro do número %.1f é: %.1f", numero, c1.dobro(numero)));
    }
}
