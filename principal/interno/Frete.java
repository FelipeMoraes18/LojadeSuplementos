package principal.interno;

public class Frete {
    private String regiaoCliente;

    public Frete(String regiaoCliente) {
        this.regiaoCliente = regiaoCliente;
    }

    public double calcularFrete() {
        if (regiaoCliente.equalsIgnoreCase("zs")) {
            System.out.println("A Taxa de frete para a região zs é:");
            return 10.0;
        } else if (regiaoCliente.equalsIgnoreCase("zn")) {
            System.out.println("A Taxa de frete para a região zn é:");
            return 0.0;
        } else {
            System.out.println("Região não identificada");
            return -1.0;
        }
    }
}
