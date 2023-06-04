package principal.interno;

public abstract class ProdutoSuplemento {
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    public ProdutoSuplemento(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public abstract String getTipo();
}


