package RelatorioService;

import java.util.List;

public class RelatorioService {

    private double total;
    private int quantidade;

    public static void main(String[] args) {
    }

    public void gerar(List<Double> valores) {

        for (Double valor : valores) {
            total += valor;
            quantidade++;
        }

        System.out.println(total);

        limpar();
    }

    private void limpar() {
        total = 0;
        quantidade = 0;
    }

    public void enviarEmail() {
    }

    public void exportar() {
    }
}