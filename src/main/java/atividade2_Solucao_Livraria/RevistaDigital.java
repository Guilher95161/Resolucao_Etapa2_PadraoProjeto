package atividade2_Solucao_Livraria;

public class RevistaDigital extends Item implements Digital{


    private static double descontoRevistaDigital;

    public RevistaDigital(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    @Override
    public void exibirDownloadLink() {
            System.out.println("Download em: ....");
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
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

