package atividade2_Solucao_Livraria;

public class RevistaDigital extends Digital {


    private static double descontoRevistaDigital;

    public RevistaDigital(String titulo, double preco, String autor) {
        super(titulo, preco, autor);
    }

    @Override
    public void exibirDownloadLink() {
            System.out.println("Download em: ....");
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco + "- Preço Com Desconto:" + precoComDesconto());
    }

    @Override
    public double getDesconto() {
        return descontoRevistaDigital;
    }

    @Override
    public void setDesconto(double desconto) {
        descontoRevistaDigital = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco-descontoRevistaDigital*preco;
    }
}

