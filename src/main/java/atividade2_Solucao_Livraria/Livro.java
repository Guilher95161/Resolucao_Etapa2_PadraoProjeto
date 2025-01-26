package atividade2_Solucao_Livraria;

public class Livro extends Item implements Fisico,Digital {

    private boolean eFisico;

    public Livro(String titulo, double preco, int quantidade, String autor, boolean eFisico) {
        super(titulo, preco, quantidade, autor);
        this.eFisico = eFisico;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
    }

    @Override
    public void exibirDownloadLink() {
        if(!eFisico){
            System.out.println("Download em: .....");
        }
    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }
}
