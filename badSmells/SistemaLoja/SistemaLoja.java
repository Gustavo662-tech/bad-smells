import java.util.ArrayList;
import java.util.List;

public class SistemaLoja {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        sistema.adicionarVenda(100);
        sistema.adicionarVenda(350);
        sistema.adicionarVenda(1200);

        sistema.processarVendas();
    }
}

class Sistema {

    private List<Double> vendas = new ArrayList<>();

    public void adicionarVenda(double valor) {
        vendas.add(valor);
    }

    public void processarVendas() {

        double total = 0;
        double impostos = 0;
        double descontos = 0;

        for (Double venda : vendas) {

            total += venda;

            if (venda > 1000) {
                descontos += venda * 0.15;
            } else if (venda > 500) {
                descontos += venda * 0.10;
            } else {
                descontos += venda * 0.02;
            }

            if (venda < 300) {
                impostos += venda * 0.05;
            } else {
                impostos += venda * 0.12;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Descontos: " + descontos);
        System.out.println("Impostos: " + impostos);

        gerarRelatorio();
        enviarEmail();
        atualizarEstoque();
    }

    public double calcularTotal() {

        double total = 0;

        for (Double venda : vendas) {
            total += venda;
        }

        return total;
    }

    public double calcularTotalComImposto() {

        double total = 0;

        for (Double venda : vendas) {
            total += venda;
        }

        return total * 1.12;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório gerado");
    }

    public void enviarEmail() {
        System.out.println("Email enviado");
    }

    public void atualizarEstoque() {
        System.out.println("Estoque atualizado");
    }
}