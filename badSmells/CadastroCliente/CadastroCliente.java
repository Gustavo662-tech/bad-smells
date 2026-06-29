package CadastroCliente;

public class CadastroCliente {

    public static void main(String[] args) {

        cadastrar(
                "João",
                "12345678900",
                "999999999",
                "Rua A",
                "100",
                "Centro",
                "Belo Horizonte",
                "MG",
                "36900000",
                "Brasil");
    }

    public static void cadastrar(
            String nome,
            String cpf,
            String telefone,
            String rua,
            String numero,
            String bairro,
            String cidade,
            String estado,
            String cep,
            String pais) {

        System.out.println("Cliente: " + nome);
    }
}
