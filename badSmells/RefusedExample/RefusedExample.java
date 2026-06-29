package RefusedExample;

public class RefusedExample {

    public static void main(String[] args) {

        Funcionario funcionario =
                new Robo();

        funcionario.baterPonto();
    }
}

class Funcionario {

    public void baterPonto() {
        System.out.println("Ponto registrado");
    }
}

class Robo extends Funcionario {

    @Override
    public void baterPonto() {
        throw new UnsupportedOperationException();
    }
}
