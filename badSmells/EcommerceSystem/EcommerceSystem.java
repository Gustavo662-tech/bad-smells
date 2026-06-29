package EcommerceSystem;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSystem {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Daniel",
                "VIP",
                new Endereco("Rua Central", "Manhuaçu", "MG")
        );

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(new Produto("Notebook", 3500, "ELETRONICO"), 1);
        pedido.adicionarItem(new Produto("Mouse", 120, "INFORMATICA"), 2);
        pedido.adicionarItem(new Produto("Livro Java", 80, "LIVROS"), 3);

        SistemaLoja sistema = new SistemaLoja();

        sistema.processarPedido(pedido);

        System.out.println("\n==========================");

        sistema.gerarRelatorioFinanceiro(pedido);
    }
}

class SistemaLoja {

    // Long Method + Switch Statements + Feature Envy + Message Chains
    public void processarPedido(Pedido pedido) {

        double total = 0;
        double desconto = 0;
        double frete = 0;

        System.out.println("Cliente: "
                + pedido.getCliente()
                         .getEndereco()
                         .getCidade()
                         .toUpperCase());

        for (ItemPedido item : pedido.getItens()) {

            Produto produto = item.getProduto();

            total += produto.getPreco() * item.getQuantidade();

            switch (produto.getCategoria()) {

                case "ELETRONICO":
                    frete += 50;
                    break;

                case "INFORMATICA":
                    frete += 20;
                    break;

                case "LIVROS":
                    frete += 10;
                    break;

                default:
                    frete += 30;
            }

            if (produto.getPreco() > 1000) {
                desconto += produto.getPreco() * 0.10;
            }

            if (produto.getPreco() > 5000) {
                desconto += produto.getPreco() * 0.15;
            }
        }

        if (pedido.getCliente().getTipo().equals("VIP")) {
            desconto += total * 0.05;
        }

        total = total + frete - desconto;

        System.out.println("Total produtos: " + total);
        System.out.println("Frete: " + frete);
        System.out.println("Desconto: " + desconto);

        enviarEmail();
        atualizarEstoque();
        emitirNotaFiscal();
        registrarLog();
    }

    // Duplicated Code
    public void gerarRelatorioFinanceiro(Pedido pedido) {

        double total = 0;

        for (ItemPedido item : pedido.getItens()) {
            total += item.getProduto().getPreco()
                    * item.getQuantidade();
        }

        System.out.println("Faturamento bruto: " + total);
    }

    // Duplicated Code
    public void gerarRelatorioEstoque(Pedido pedido) {

        double total = 0;

        for (ItemPedido item : pedido.getItens()) {
            total += item.getProduto().getPreco()
                    * item.getQuantidade();
        }

        System.out.println("Valor em estoque: " + total);
    }

    public void enviarEmail() {
        System.out.println("Email enviado");
    }

    public void atualizarEstoque() {
        System.out.println("Estoque atualizado");
    }

    public void emitirNotaFiscal() {
        System.out.println("Nota fiscal emitida");
    }

    public void registrarLog() {
        System.out.println("Log registrado");
    }

    public void gerarBackup() {
        System.out.println("Backup realizado");
    }

    public void sincronizarERP() {
        System.out.println("ERP sincronizado");
    }
}

class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}

class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

class Produto {

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}

class Cliente {

    private String nome;
    private String tipo;
    private Endereco endereco;

    public Cliente(String nome, String tipo, Endereco endereco) {
        this.nome = nome;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

class Endereco {

    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
