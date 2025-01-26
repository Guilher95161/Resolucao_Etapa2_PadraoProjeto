package atividade2_Solucao_Livraria;

public class JogoDeTabuleiro extends Item implements Fisico{

    public JogoDeTabuleiro(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Jogo de Tabuleiro: " + titulo + " - Criador: " + autor + " - Preço: R$" + preco);
    }
}
