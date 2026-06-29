package UtilSistema;

public class UtilSistema {

    public static void main(String[] args) {

        UtilSistema util = new UtilSistema();

        util.enviarEmail();
        util.calcularImposto(1000);
        util.gerarHash("teste");
    }

    // envia email para usuário
    public void enviarEmail() {
        System.out.println("Email enviado");
    }

    // calcula imposto financeiro
    public double calcularImposto(double valor) {
        return valor * 0.15;
    }

    // gera hash do texto
    public String gerarHash(String texto) {
        return String.valueOf(texto.hashCode());
    }

    // autentica usuário no sistema
    public void autenticar() {
        System.out.println("Usuário autenticado");
    }

    // exporta relatório para csv
    public void exportarCsv() {
        System.out.println("CSV exportado");
    }

    // gera backup do banco
    public void gerarBackup() {
        System.out.println("Backup gerado");
    }

    // limpa cache da aplicação
    public void limparCache() {
        System.out.println("Cache limpo");
    }
}
