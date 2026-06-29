package RelatorioCliente;

public class RelatorioCliente {

    public static void main(String[] args) {

        Cidade cidade = new Cidade("Belo Horizonte");
        Endereco endereco = new Endereco(cidade);
        Cliente cliente = new Cliente(endereco);

        Departamento departamento =
                new Departamento(new Gerente("Carlos"));

        System.out.println(
                gerarResumo(cliente));

        System.out.println(
                departamento.getNomeGerente());
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

class Departamento {

    private Gerente gerente;

    public Departamento(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getNomeGerente() {
        return gerente.getNome();
    }
}

class Gerente {

    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
