package atividade2_Solucao_Livraria;

public class Videogame extends Item implements Fisico, Digital {

    private boolean eFisico;

    public Videogame(String titulo, double preco, int quantidade, String autor, boolean eFisico) {
        super(titulo, preco, quantidade, autor);
        this.eFisico = eFisico;
    }

    public void exibirDetalhes() {
        System.out.println("Videogame: " + titulo + " - Desenvolvedor: " + autor + " - Preço: R$" + preco);
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDownloadLink() {
        if (!eFisico) {
            System.out.println("Download em: ....");
        }
    }

}
