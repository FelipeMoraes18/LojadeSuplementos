package principal.interno;

public class Glutamina extends ProdutoSuplemento {
    public Glutamina(String nome, double preco, String descricao, int quantidade) {
        super(nome, preco, descricao, quantidade);
    }

    public String getTipo() {
        return "Glutamina";
    }
}
