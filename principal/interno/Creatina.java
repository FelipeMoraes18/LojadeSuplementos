package principal.interno;

public class Creatina extends ProdutoSuplemento {
    public Creatina(String nome, double preco, String descricao, int quantidade) {
        super(nome, preco, descricao, quantidade);
    }

    public String getTipo() {
        return "Creatina";
    }
}
