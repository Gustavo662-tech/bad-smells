package SistemaCorporativo;

public class SistemaCorporativo {

    public static void main(String[] args) {

        SistemaCorporativo sistema =
                new SistemaCorporativo();

        sistema.autenticar();
        sistema.gerarBackup();
    }

    public void autenticar() {
        System.out.println("Autenticado");
    }

    public void cadastrarCliente() {
    }

    public void excluirCliente() {
    }

    public void cadastrarProduto() {
    }

    public void gerarRelatorio() {
    }

    public void enviarEmail() {
    }

    public void exportarPlanilha() {
    }

    public void calcularFolhaPagamento() {
    }

    public void processarPagamento() {
    }

    public void emitirNotaFiscal() {
    }

    public void gerarBackup() {
        System.out.println("Backup realizado");
    }

    public void sincronizarERP() {
    }
}
