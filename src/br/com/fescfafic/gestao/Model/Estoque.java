package br.com.fescfafic.gestao.Model;

public abstract class Estoque {
    public Produto[] listaDeProdutosEstoque;

    public Estoque(int limiteDeProdutos) {
        this.listaDeProdutosEstoque = new Produto[limiteDeProdutos];
    }

    public void verificarDisponibilidade(Produto produto) {
        if (this.verificarExistencia(produto) == true) {
            if (produto.qtdEstoque > 0) {
                System.out.printf("Quantidade em estoque do produto %s: %d unidade(s).", produto.nome, produto.qtdEstoque);
            } else {
                System.out.printf("Esse produto esta esgotado.");
            }
        } else {
            System.out.printf("Esse produto ainda nao foi cadastrado no estoque.");
        }
    }
    public boolean verificarExistencia(Produto produto) {
        for (int i = 0; i < this.listaDeProdutosEstoque.length; i++) {
            if (this.listaDeProdutosEstoque[i] == produto) {
                return true;
            }
        }
        return false;
    }
    public void adicionarProduto(Produto produto) {
        if (this.verificarExistencia(produto) == true) {
            System.out.printf("Esse produto ja esta cadastrado, tente atualizar as informacoes.");
        } else {
            for (int i = 0; i < this.listaDeProdutosEstoque.length; i++) {
                if (this.listaDeProdutosEstoque[i] == null) {
                    this.listaDeProdutosEstoque[i] = produto;
                    System.out.printf("O produto %s foi adicionado com sucesso.", produto.nome);
                    return;
                }
            }
            System.out.printf("Nao foi possivel adicionar o produto, o estoque ja atingiu sua capacidade maxima.");
        }
    }
    public void atualizarProduto(Produto produto, String idDoProduto, String nome, String descricao, double preco, int qtdEstoque) {
        if (this.verificarExistencia(produto) == true) {
            produto.nome = nome;
            produto.idDoProduto = idDoProduto;
            produto.descricao = descricao;
            produto.preco = preco;
            produto.qtdEstoque = qtdEstoque;
            System.out.printf("Produto %s teve suas informacoes atualizadas com sucesso.", produto.nome);
        } else {
            System.out.printf("Esse produto ainda nao foi cadastrado no estoque.");
        }
    }
    public void excluirProduto(Produto produto) {
        for (int i = 0; i < this.listaDeProdutosEstoque.length; i++) {
            if (this.listaDeProdutosEstoque[i] == produto) {
                System.out.printf("O produto %s foi excluido com sucesso.", this.listaDeProdutosEstoque[i].nome);
                this.listaDeProdutosEstoque[i] = null;
                return;
            }
        }
        System.out.printf("Esse produto ainda nao foi cadastrado no estoque.");
    }
    public void gerarRelatorio() {
        boolean encontrado = false;
        System.out.printf("Produto(s) cadastrado(s) no estoque: ");
        for (int i = 0; i < this.listaDeProdutosEstoque.length; i++) {
            if (this.listaDeProdutosEstoque[i] != null) {
                System.out.printf("\n - ID: %s - Nome: %s", this.listaDeProdutosEstoque[i].idDoProduto, this.listaDeProdutosEstoque[i].nome);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.printf("Nenhum.");
        }
    }
}
