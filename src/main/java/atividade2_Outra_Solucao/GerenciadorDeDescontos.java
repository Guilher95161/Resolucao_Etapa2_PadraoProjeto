package atividade2_Outra_Solucao;

public class GerenciadorDeDescontos
{
    public static void alterarDesconto(Descontavel item, double desconto)
    {
        item.setDesconto(desconto);
    }

    public static void main(String[] args) {

        JogoDeTabuleiro jogoDeTabuleiro = new JogoDeTabuleiro();
        jogoDeTabuleiro.setDesconto(0.3);
        jogoDeTabuleiro.setPreco(234);
        System.out.println(jogoDeTabuleiro.precoComDesconto());
        alterarDesconto(jogoDeTabuleiro,0.15);
        System.out.println(jogoDeTabuleiro.precoComDesconto());

        JogoDeVideogame jogoDeVideogame = new JogoDeVideogame();
        jogoDeVideogame.setDesconto(0);
        jogoDeVideogame.setPreco(270);
        System.out.println(jogoDeVideogame.precoComDesconto());

        LivroDigital livroDigital = new LivroDigital();
        livroDigital.setDesconto(0.15);
        livroDigital.setPreco(66);
        System.out.println(livroDigital.precoComDesconto());

        LivroFisico livroFisico = new LivroFisico();
        livroFisico.setDesconto(0.30);
        livroFisico.setPreco(99);
        System.out.println(livroFisico.precoComDesconto());

        RevistaDigital revistaDigital1 = new RevistaDigital();
        revistaDigital1.setDesconto(0.15);
        revistaDigital1.setPreco(50);
        System.out.println(revistaDigital1.precoComDesconto());

        RevistaFisica revistaFisica = new RevistaFisica();
        revistaFisica.setDesconto(0.30);
        revistaFisica.setPreco(100);
        System.out.println(revistaFisica.precoComDesconto());

    }
}
