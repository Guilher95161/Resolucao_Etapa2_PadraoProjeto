package atividade2_Solucao_Livraria;

public class Videogame extends Item implements  Digital{

    private static double descontoVideogame;


    public Videogame(String titulo, double preco, int quantidade, String autor) {
        super(titulo, preco, quantidade, autor);
    }

    public void exibirDetalhes() {
        System.out.println("Videogame: " + titulo + " - Desenvolvedor: " + autor + " - Preço: R$" + preco);
    }


    @Override
    public void exibirDownloadLink() {
            System.out.println("Download em: ....");
        }

    @Override
    public double getDesconto() {
        return descontoVideogame;
    }

    @Override
    public void setDesconto(double desconto) {
        descontoVideogame = desconto;
    }

    @Override
    public double precoComDesconto() {
        return preco-descontoVideogame*preco;
    }
}
