package Empresa;

public class Empresa {

    public static void main(String[] args) {

        Departamento departamento =
                new Departamento(new Gerente("Carlos"));

        System.out.println(
                departamento.getNomeGerente());
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
