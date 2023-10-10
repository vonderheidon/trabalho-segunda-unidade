package br.com.fescfafic.gestao.Model;

public class EstoqueDeProdutosEletronicos extends Estoque {
    public boolean deveTerProtecaoContraInterferenciaEletromagnetica;

    public EstoqueDeProdutosEletronicos(int limiteDeProdutos, boolean deveTerProtecaoContraInterferenciaEletromagnetica) {
        super(limiteDeProdutos);
        this.deveTerProtecaoContraInterferenciaEletromagnetica = deveTerProtecaoContraInterferenciaEletromagnetica;
    }
}
