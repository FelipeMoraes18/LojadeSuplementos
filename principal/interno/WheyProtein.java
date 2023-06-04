package principal.interno;

public class WheyProtein extends ProdutoSuplemento {
    public WheyProtein(String nome, double preco, String descricao, int quantidade) {
        super(nome, preco, descricao, quantidade);
    }
    
    public String getTipo() {
        return "Whey Protein";
    }
}
