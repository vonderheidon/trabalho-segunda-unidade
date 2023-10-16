package br.com.fescfafic.gestao.Main;

import br.com.fescfafic.gestao.Model.EstoqueDeFrutas;
import br.com.fescfafic.gestao.Model.Gestor;
import br.com.fescfafic.gestao.Model.ProdutoAbacaxi;

public class Main {
    public static void main(String[] args) {
        ProdutoAbacaxi abacaxi = new ProdutoAbacaxi(
                "123",
                "Abacaxi Coral",
                "Doce como mel",
                4,
                2
        );
        EstoqueDeFrutas estoqueDeFrutas = new EstoqueDeFrutas(2);

        estoqueDeFrutas.adicionarProduto(abacaxi);
        System.out.println();
        estoqueDeFrutas.verificarDisponibilidade(abacaxi);
        System.out.println();
    }
}