package br.com.fescfafic.gestao.Model;

public abstract class Gestor {
    public Fornecedor[] listaDeFornecedores;

    public Gestor(int limiteDeFornecedores) {
        this.listaDeFornecedores = new Fornecedor[limiteDeFornecedores];
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        System.out.printf("Cadastrando o fornecedor");
    }
    public void buscarProdutoPorNome(Produto produto) {
        System.out.printf("Buscando o produto por nome");
    }
    public void buscarProdutoPorID(int id) {
        System.out.printf("Buscando o produto por id");
    }
    public void exibirInfoFornecedor(String cnpj) {
        System.out.printf("Exibindo informacoes do fornecedor");
    }
    public void exibirInfoProduto(int idDoProduto) {
        System.out.printf("Exibindo informacoes do produto");
    }
}
