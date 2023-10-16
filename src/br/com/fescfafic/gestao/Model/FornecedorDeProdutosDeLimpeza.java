package br.com.fescfafic.gestao.Model;

public class FornecedorDeProdutosDeLimpeza extends Fornecedor {
    public boolean requerOUsoDeEpi;

    public FornecedorDeProdutosDeLimpeza(String nome, String cnpj, int limiteDeProdutos, boolean requerOUsoDeEpi) {
        super(nome, cnpj, limiteDeProdutos);
        this.requerOUsoDeEpi = requerOUsoDeEpi;
    }
}
