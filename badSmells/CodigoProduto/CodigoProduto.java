package CodigoProduto;

public class CodigoProduto {

    private String codigo;

    public CodigoProduto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static void main(String[] args) {
        CodigoProduto c = new CodigoProduto("ABC");
        System.out.println(c.getCodigo());
    }
}