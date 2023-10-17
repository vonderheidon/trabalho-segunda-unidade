package br.com.fescfafic.gestao.Main;

import br.com.fescfafic.gestao.Model.*;

public class Main {
    public static void main(String[] args) {
        ProdutoAbacaxi abacaxi = new ProdutoAbacaxi(
                "123",
                "Abacaxi",
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
        FornecedorDeFrutas fornecedorDeFrutas = new FornecedorDeFrutas(
                "Frutas frescas ltda.",
                "123123123",
                4,
                "jefferson caminhoes ara ara"
        );
        EstoqueDeFrutas estoqueDeFrutas = new EstoqueDeFrutas(2);
        Gestor gestor = new Gestor(3);

        System.out.println(" -- Exibindo info de um produto:");
        abacaxi.exibirInfo();

        System.out.println("\n\n -- Exibindo info de um fornecedor:");
        fornecedorDeFrutas.exibirInfo();

        System.out.println("\n\n -- Adicionando um produto ao estoque:");
        estoqueDeFrutas.adicionarProduto(goiaba);
        estoqueDeFrutas.adicionarProduto(abacaxi);

        System.out.println("\n\n -- Verificando disponibilidade de um produto do estoque:");
        estoqueDeFrutas.verificarDisponibilidade(goiaba);

        System.out.println("\n\n -- Atualizando um produto do estoque:");
        estoqueDeFrutas.atualizarProduto(goiaba, "124",
                "Goiaba",
                "Goiaba docinha",
                6,
                5);

        System.out.println("\n\n -- Excluindo um produto do estoque:");
        estoqueDeFrutas.excluirProduto(goiaba);

        System.out.println("\n\n -- Gerando relatorio do estoque:");
        estoqueDeFrutas.gerarRelatorio();

        System.out.println("\n\n -- Cadastrando fornecedor:");
        gestor.cadastrarFornecedor(fornecedorDeFrutas);

        System.out.println("\n\n -- Buscando produto por nome:");
        gestor.buscarProdutoPorNome("abacaxi", estoqueDeFrutas);

        System.out.println("\n\n -- Buscando produto por ID:");
        gestor.buscarProdutoPorID("123", estoqueDeFrutas);

        System.out.println("\n\n -- Exibindo infos detalhadas de um fornecedor:");
        gestor.exibirInfoFornecedor("123123123");

        System.out.println("\n\n -- Exibindo infos detalhadas de um produto:");
        gestor.exibirInfoProduto(abacaxi);
    }
}