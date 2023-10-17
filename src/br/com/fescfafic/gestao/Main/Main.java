package br.com.fescfafic.gestao.Main;

import br.com.fescfafic.gestao.Model.EstoqueDeFrutas;
import br.com.fescfafic.gestao.Model.Gestor;
import br.com.fescfafic.gestao.Model.ProdutoAbacaxi;
import br.com.fescfafic.gestao.Model.ProdutoGoiaba;

public class Main {
    public static void main(String[] args) {
        ProdutoAbacaxi abacaxi = new ProdutoAbacaxi(
                "123",
                "Abacaxi Coral",
                "Doce como mel",
                4,
                2
        );
        ProdutoGoiaba goiaba = new ProdutoGoiaba(
                "124",
                "Goiaba",
                "Goiaba da terra",
                4,
                5
        );
        EstoqueDeFrutas estoqueDeFrutas = new EstoqueDeFrutas(1);
        estoqueDeFrutas.adicionarProduto(abacaxi);
        System.out.println();
        estoqueDeFrutas.adicionarProduto(goiaba);
        System.out.println();
    }
}