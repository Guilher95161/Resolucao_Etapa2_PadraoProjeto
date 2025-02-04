package atividade2_Solucao_Livraria;


public class RevistaFisica extends  Fisico{

    private static double descontoRevistaFisica;

    public RevistaFisica(String titulo, double preco, int quantidade, String autor) {
        super(quantidade,titulo, preco, autor);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco + "- Preço Com Desconto:" + precoComDesconto());
    }

    @Override
    public double getDesconto() {
        return descontoRevistaFisica;
    }

    @Override
    public void setDesconto(double desconto) {
        descontoRevistaFisica = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco-descontoRevistaFisica*preco;
    }
}
