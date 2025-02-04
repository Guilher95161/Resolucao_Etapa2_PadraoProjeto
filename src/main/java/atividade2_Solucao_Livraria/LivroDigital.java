package atividade2_Solucao_Livraria;


public class LivroDigital extends Digital {

    private static double descontoLivroDigital;

    public LivroDigital(String titulo, double preco, String autor) {
        super(titulo, preco, autor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco + "- Preço Com Desconto:" + precoComDesconto());
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

