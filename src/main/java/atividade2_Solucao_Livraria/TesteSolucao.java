package atividade2_Solucao_Livraria;

public class TesteSolucao
{

    public static void main(String[] args) {

        //Mudar alguma coisa para os bagulhos digitais não terem quantidade
        JogoDeTabuleiro tabuleiro = new JogoDeTabuleiro("Monopoly", 199.99, 5,"Martel");
        Videogame videogame = new Videogame("Spider-Man", 275.00, "Marvel");
        RevistaDigital revistaDigital = new RevistaDigital("O Globo", 33.56,"Alguém");
        RevistaFisica  revistaFisica = new RevistaFisica("O Tempo", 22.75,10,"Autor de O Tempo");
        LivroDigital livroDigital = new LivroDigital("Knight of Chaos", 9.99,"Roberto Calanzas");
        LivroFisico livroFisico = new LivroFisico("One Punch Man", 37.99, 55, "One & Murata");

        GerenciadorDeDescontos gerenciador = new GerenciadorDeDescontos();
        gerenciador.alterarDesconto(tabuleiro, 0.3);
        gerenciador.alterarDesconto(revistaFisica, 0.3);
        gerenciador.alterarDesconto(livroFisico, 0.3);

        gerenciador.alterarDesconto(livroDigital, 0.15);
        gerenciador.alterarDesconto(revistaDigital, 0.15);


        //Poderia ser um metodo de gerenciador que exibiria os descontos dos produtos que possui
        tabuleiro.exibirDetalhes();
        videogame.exibirDetalhes();
        revistaFisica.exibirDetalhes();
        livroFisico.exibirDetalhes();
        revistaDigital.exibirDetalhes();
        livroDigital.exibirDetalhes();
    }
}
