package atividade2_Solucao_Livraria;

public abstract class Fisico extends Item{
    protected int quantidade;

    Fisico(int quantidade, String titulo, double preco, String autor) {
        super(titulo,preco,autor);
        this.quantidade = quantidade;
    }

    abstract void exibirFormato();

    public int getQuantidade() {
        return quantidade;
    }
}
