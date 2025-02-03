package atividade2_Solucao_Livraria;

public class LivroFisico extends Item implements Fisico {

    private static double descontoLivroFisico;

    public LivroFisico(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    public static void alterarDesconto(double desconto) {
        descontoLivroFisico = desconto;
    }

    @Override
    public double getDesconto() {
        return descontoLivroFisico;
    }

    @Override
    public void setDesconto(double desconto) {
descontoLivroFisico = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco - preco*descontoLivroFisico;
    }
}
