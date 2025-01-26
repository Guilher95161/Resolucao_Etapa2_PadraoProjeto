package atividade2_Solucao_Livraria;


public class Revista extends Item implements Digital,Fisico{
    boolean eFisico;

    public Revista(String titulo, double preco, int quantidade, String autor, boolean eFisico) {
        super(titulo, preco, quantidade, autor);
        this.eFisico = eFisico;
    }

    @Override
    public void exibirDownloadLink() {
        if(!eFisico){
            System.out.println("Download em: ....");
        }

    }

    @Override
    public void exibirFormato() {
        System.out.println("Mídia Física");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco);
    }
}
