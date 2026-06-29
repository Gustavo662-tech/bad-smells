package EnderecoService;

public class EnderecoService {

    public static void main(String[] args) {

        salvarEndereco(
                "Rua A",
                "100",
                "Centro",
                "Vitória",
                "ES",
                "29900000");
    }

    public static void salvarEndereco(
            String rua,
            String numero,
            String bairro,
            String cidade,
            String estado,
            String cep) {

        System.out.println("Endereço salvo");
    }
}
