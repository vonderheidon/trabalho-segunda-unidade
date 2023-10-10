package br.com.fescfafic.gestao.Model;

public class FornecedorDeProdutosDeLimpeza extends Fornecedor {
    public boolean requerOUsoDeEpiParaManuseio;

    public FornecedorDeProdutosDeLimpeza(String nome, String cnpj, int limiteDeProdutos, boolean requerOUsoDeEpiParaManuseio) {
        super(nome, cnpj, limiteDeProdutos);
        this.requerOUsoDeEpiParaManuseio = requerOUsoDeEpiParaManuseio;
    }
}
