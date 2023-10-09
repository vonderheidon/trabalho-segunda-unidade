package br.com.fescfafic.gestao.Model;

public abstract class Estoque {
    public Produto[] listaDeProdutosEstoque;

    public Estoque(int limiteDeProdutos) {
        this.listaDeProdutosEstoque = new Produto[limiteDeProdutos];
    }

    public boolean verificarDisponibilidade() {
        return true;
    }
    public void adicionarProduto(Produto produto) {
        System.out.printf("Adicionando produto");
    }
    public void atualizarProduto(Produto produto) {
        System.out.printf("Atualizando produto");
    }
    public void excluirProduto(Produto produto) {
        System.out.printf("Excluindo produto");
    }
    public void gerarRelatorio() {
        System.out.printf("Gerando relatorio");
    }
}
