package atividade2_Solucao_Livraria;


public class LivroDigital extends Item implements Digital {

    private static double descontoLivroDigital;

    public LivroDigital(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
    }

    @Override
    public void exibirDownloadLink() {
        System.out.println("Download em: .....");
    }

    @Override
    public double getDesconto() {
        return descontoLivroDigital;
    }

    @Override
    public void setDesconto(double desconto) {
        descontoLivroDigital = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco -preco*descontoLivroDigital;
    }
}

