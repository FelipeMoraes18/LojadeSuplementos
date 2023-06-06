package principal.interno;

public class Frete {
    private CalculadoraFrete calculadoraFrete;

    public Frete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public double calcularFrete() {
        return calculadoraFrete.calcularFrete();
    }
 }