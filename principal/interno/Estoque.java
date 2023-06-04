package principal.interno;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque instancia = null;
    private List<ProdutoSuplemento> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }
    public static Estoque getInstancia() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    public void adicionarProduto(ProdutoSuplemento produto) {
        produtos.add(produto);
    }

    public void removerProduto(ProdutoSuplemento produto) {
        produtos.remove(produto);
    }

    public List<ProdutoSuplemento> listarProdutos() {
        return produtos;
    }

    public boolean verificarDisponibilidade(ProdutoSuplemento produto, int quantidade) {
        int quantidadeDisponivel = produto.getQuantidade();
        
        if (quantidadeDisponivel >= quantidade) {
            return true;
        } else {
            return false;
        }
    }

    public void atualizarEstoque(ProdutoSuplemento produto, int quantidade) {
        int quantidadeDisponivel = produto.getQuantidade();
        
        if (quantidadeDisponivel >= quantidade) {
            int novaQuantidade = quantidadeDisponivel - quantidade;
            produto.setQuantidade(novaQuantidade);
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente no estoque.");
        }
    }

}
