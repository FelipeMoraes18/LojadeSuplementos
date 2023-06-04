package principal.interno;

public class Termogenico extends ProdutoSuplemento {
    public Termogenico(String nome, double preco, String descricao, int quantidade) {
        super(nome, preco, descricao, quantidade);
    }
    
    public String getTipo() {
        return "Termogênico";
    }
}