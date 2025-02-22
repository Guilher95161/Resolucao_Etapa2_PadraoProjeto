package atividade2_Solucao_Livraria;

public class JogoDeTabuleiro extends Fisico{

    private static double descontoJogoTabuleiro;

    public JogoDeTabuleiro(String titulo, double preco, int quantidade, String autor) {
        super(quantidade,titulo, preco, autor);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Jogo de Tabuleiro: " + titulo + " - Criador: " + autor + " - Preço: R$" + preco + "- Preço Com Desconto:" + precoComDesconto());
    }

    @Override
    public double getDesconto() {
        return descontoJogoTabuleiro;
    }

    @Override
    public void setDesconto(double desconto) {
        descontoJogoTabuleiro = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco-descontoJogoTabuleiro*preco;
    }
}
