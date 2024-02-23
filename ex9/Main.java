package ex9;

import java.util.Arrays;

/*Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.*/
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria Eduarda");
        aluno1.setNotas(new double[] {10, 7.5});

        System.out.println("Nome do(a) aluno(a): " + aluno1.getNome());
        System.out.println("Notas: " + Arrays.toString(aluno1.getNotas()));
        System.out.println("Média: " + aluno1.calcularMedia());
    }
}