package br.com.fescfafic.gestao.Model;

public abstract class Estoque {
    public Produto[] listaDeProdutosEstoque;

    public Estoque(int limiteDeProdutos) {
        this.listaDeProdutosEstoque = new Produto[limiteDeProdutos];
    }

    public void verificarDisponibilidade(Produto produto) {
        if (verificarExistencia(produto) == true) {
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
        if (verificarExistencia(produto) == true) {
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
