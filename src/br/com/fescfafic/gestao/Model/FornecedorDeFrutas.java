package br.com.fescfafic.gestao.Model;

public class FornecedorDeFrutas extends Fornecedor {
    public String tipoDeCompartimentoDaCarga;

    public FornecedorDeFrutas(String nome, String cnpj, int limiteDeProdutos, String tipoDeCompartimentoDaCarga) {
        super(nome, cnpj, limiteDeProdutos);
        this.tipoDeCompartimentoDaCarga = tipoDeCompartimentoDaCarga;
    }
}
