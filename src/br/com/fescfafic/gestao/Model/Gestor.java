package br.com.fescfafic.gestao.Model;

public class Gestor {
    public Fornecedor[] listaDeFornecedores;

    public Gestor(int limiteDeFornecedores) {
        this.listaDeFornecedores = new Fornecedor[limiteDeFornecedores];
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        for (int i = 0; i < this.listaDeFornecedores.length; i++) {
            if (this.listaDeFornecedores[i] == null) {
                this.listaDeFornecedores[i] = fornecedor;
                System.out.printf("Fornecedor %s cadastrado com sucesso.", fornecedor.nome);
                return;
            }
        }
        System.out.printf("Nao foi possivel cadastrar um novo fornecedor, quantidade maxima atingida.");
    }
    public void buscarProdutoPorNome(String nomeDoProduto, Estoque estoque) {
        boolean encontrado = false;
        System.out.printf("Produto(s) encontrado(s) com o nome \"%s\": ", nomeDoProduto);
        for (int i = 0; i < estoque.listaDeProdutosEstoque.length; i++) {
            if (estoque.listaDeProdutosEstoque[i] != null && estoque.listaDeProdutosEstoque[i].nome.equalsIgnoreCase(nomeDoProduto)) {
                System.out.printf("\n - ID: %s - Nome: %s", estoque.listaDeProdutosEstoque[i].idDoProduto, estoque.listaDeProdutosEstoque[i].nome);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.printf("Nenhum.");
        }
    }
    public void buscarProdutoPorID(String id, Estoque estoque) {
        boolean encontrado = false;
        System.out.printf("Produto(s) encontrado(s) com o ID \"%s\": ", id);
        for (int i = 0; i < estoque.listaDeProdutosEstoque.length; i++) {
            if (estoque.listaDeProdutosEstoque[i] != null && estoque.listaDeProdutosEstoque[i].idDoProduto.equalsIgnoreCase(id)) {
                System.out.printf("\n - ID: %s - Nome: %s", estoque.listaDeProdutosEstoque[i].idDoProduto, estoque.listaDeProdutosEstoque[i].nome);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.printf("Nenhum.");
        }
    }
    public void exibirInfoFornecedor(String cnpj) {
        for (int i = 0; i < this.listaDeFornecedores.length; i++) {
            if (this.listaDeFornecedores[i] != null && this.listaDeFornecedores[i].cnpj.equalsIgnoreCase(cnpj)) {
                this.listaDeFornecedores[i].exibirInfo();
                return;
            }
        }
        System.out.printf("Nao foi encontrado nenhum fornecedor com esse CNPJ.");
    }
    public void exibirInfoProduto(Produto produto) {
        produto.exibirInfo();
    }
}
