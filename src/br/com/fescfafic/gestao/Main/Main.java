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
                200
        );
        EstoqueDeFrutas estoqueDeFrutas = new EstoqueDeFrutas(400);
        estoqueDeFrutas.verificarDisponibilidade(abacaxi);
        System.out.println();
        estoqueDeFrutas.adicionarProduto(abacaxi);
        estoqueDeFrutas.verificarDisponibilidade(abacaxi);
        System.out.println();
    }
}