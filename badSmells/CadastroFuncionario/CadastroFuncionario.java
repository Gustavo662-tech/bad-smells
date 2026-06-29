public class CadastroFuncionario {

    public static void main(String[] args) {

        cadastrar(
                "Daniel",
                "12345678900",
                "999999999",
                "Rua A",
                "150",
                "Centro",
                "Manhuaçu",
                "MG",
                "36900000",
                "Analista",
                5000
        );
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
            String cargo,
            double salario) {

        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(telefone);
        System.out.println(rua);
        System.out.println(numero);
        System.out.println(bairro);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(cep);
        System.out.println(cargo);
        System.out.println(salario);
    }
}