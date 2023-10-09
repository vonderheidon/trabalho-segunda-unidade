package br.com.fescfafic.gestao.Model;

public abstract class Fornecedor {
    public String nome;
    public String cnpj;
    public Produto[] listaDeProdutosFornecidos;

    public Fornecedor(String nome, String cnpj, int limiteDeProdutos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaDeProdutosFornecidos = new Produto[limiteDeProdutos];
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nCNPJ: %s", this.cnpj);
    }
}
