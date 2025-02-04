package atividade2_Solucao_Livraria;

public abstract class Digital extends Item {

        Digital(String titulo, double preco, String autor) {
            super(titulo, preco, autor);
        }

    abstract void exibirDownloadLink();
}
