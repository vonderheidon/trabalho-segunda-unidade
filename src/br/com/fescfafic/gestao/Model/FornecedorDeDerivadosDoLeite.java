package br.com.fescfafic.gestao.Model;

public class FornecedorDeDerivadosDoLeite extends Fornecedor {
    public boolean possuiCaminhaoRefrigerado;

    public FornecedorDeDerivadosDoLeite(String nome, String cnpj, int limiteDeProdutos, boolean possuiCaminhaoRefrigerado) {
        super(nome, cnpj, limiteDeProdutos);
        this.possuiCaminhaoRefrigerado = possuiCaminhaoRefrigerado;
    }
}
