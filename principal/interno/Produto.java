package principal.interno;

public class Produto extends ProdutoSuplemento {
    public Produto(String nome, double preco, String descricao, int quantidade) {
        super(nome, preco, descricao, quantidade);
    }
    public String getTipo() {
        return "Produto";
    }
}
