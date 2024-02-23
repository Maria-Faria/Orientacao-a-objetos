package ex9;

public class Aluno {
    private String nome;
    private double notas[] = new double[2];

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        return (notas[0] + notas[1])/2;
    }
}
