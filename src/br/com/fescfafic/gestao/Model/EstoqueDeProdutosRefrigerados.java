package br.com.fescfafic.gestao.Model;

public class EstoqueDeProdutosRefrigerados extends Estoque {
    public double temperaturaAmbienteAdequada;

    public EstoqueDeProdutosRefrigerados(int limiteDeProdutos, double temperaturaAmbienteAdequada) {
        super(limiteDeProdutos);
        this.temperaturaAmbienteAdequada = temperaturaAmbienteAdequada;
    }
}
