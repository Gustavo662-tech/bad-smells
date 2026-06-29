package PedidoService;

public class PedidoService {

    public static void main(String[] args) {
        System.out.println(calcular(100));
    }

    public static double calcular(double valor) {
        return valor * 0.9;
    }
}

class OrcamentoService {

    public static double calcular(double valor) {
        return valor * 0.9;
    }
}

class FaturaService {

    public static double calcular(double valor) {
        return valor * 0.9;
    }
}
