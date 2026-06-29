package ResumoPedido;

public class ResumoPedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                new Endereco(
                        new Cidade("São Paulo")));

        System.out.println(gerarResumo(cliente));
    }

    public static String gerarResumo(Cliente cliente) {

        return cliente.getEndereco()
                .getCidade()
                .getNome()
                .toUpperCase();
    }
}

class Cliente {

    private Endereco endereco;

    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

class Endereco {

    private Cidade cidade;

    public Endereco(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }
}

class Cidade {

    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
