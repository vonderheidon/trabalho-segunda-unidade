package br.com.fescfafic.gestao.Model;

public abstract class Produto {
    public String idDoProduto;
    public String nome;
    public String descricao;
    public double preco;
    public int qtdEstoque;

    public Produto(String idDoProduto, String nome, String descricao, double preco, int qtdEstoque) {
        this.idDoProduto = idDoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void exibirInfo() {
        System.out.printf("ID: %s", this.idDoProduto);
        System.out.printf("\nNome: %s", this.nome);
        System.out.printf("\nDescricao: %s", this.descricao);
        System.out.printf("\nPreco: R$ %.2f", this.preco);
        System.out.printf("\nQuantidade em estoque: %d", this.qtdEstoque);
    }
}
