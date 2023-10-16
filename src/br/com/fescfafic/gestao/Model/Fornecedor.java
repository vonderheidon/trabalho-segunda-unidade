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
    public void cadastrarProduto(Produto produto) {
        for (int i = 0; i < this.listaDeProdutosFornecidos.length; i++) {
            if (this.listaDeProdutosFornecidos[i] == null) {
                this.listaDeProdutosFornecidos[i] = produto;
                System.out.printf("Produto %s cadastrado com sucesso.", produto.nome);
                return;
            }
        }
        System.out.printf("Nao foi possivel cadastrar o produto %s, limite maximo de produtos fornecidos atingido.", produto.nome);
    }
}
