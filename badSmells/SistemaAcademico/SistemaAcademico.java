package SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {

    private List<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();

        sistema.adicionarNota(10);
        sistema.adicionarNota(7);
        sistema.adicionarNota(5);

        sistema.processarAluno();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public void processarAluno() {

        double soma = 0;
        double maior = 0;
        double menor = 999;

        for (Double nota : notas) {

            soma += nota;

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 7) {
                System.out.println("Aprovado na disciplina");
            } else if (nota >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

        System.out.println("Média: " + soma / notas.size());
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        gerarRelatorio();
        enviarEmail();
        salvarBanco();
    }

    public void gerarRelatorio() {
        System.out.println("Relatório");
    }

    public void enviarEmail() {
        System.out.println("Email enviado");
    }

    public void salvarBanco() {
        System.out.println("Dados salvos");
    }
}