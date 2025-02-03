package atividade2_Solucao_Livraria;


public class RevistaFisica extends Item implements Fisico{

    private static double descontoRevistaFisica;

    public RevistaFisica(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
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
