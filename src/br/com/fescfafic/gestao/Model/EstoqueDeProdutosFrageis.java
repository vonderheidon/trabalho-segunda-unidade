package br.com.fescfafic.gestao.Model;

public class EstoqueDeProdutosFrageis extends Estoque {
    public int empilhamentoMaximoDeCaixas;

    public EstoqueDeProdutosFrageis(int limiteDeProdutos, int empilhamentoMaximoDeCaixas) {
        super(limiteDeProdutos);
        this.empilhamentoMaximoDeCaixas = empilhamentoMaximoDeCaixas;
    }
}
