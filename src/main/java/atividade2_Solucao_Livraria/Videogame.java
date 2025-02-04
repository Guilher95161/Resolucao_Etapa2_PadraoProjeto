package atividade2_Solucao_Livraria;

public class Videogame extends Digital {

    private static double descontoVideogame;


    public Videogame(String titulo, double preco, String autor) {
        super(titulo, preco, autor);
    }

    public void exibirDetalhes() {
        System.out.println("Videogame: " + titulo + " - Desenvolvedor: " + autor + " - Preço: R$" + preco + "- Preço Com Desconto:" + precoComDesconto());
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
