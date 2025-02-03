package atividade2_Solucao_Livraria;

public abstract class Item implements Descontavel {
    protected String titulo;
    protected String autor;
    protected double preco;
    protected int quantidade;

    public Item(String titulo, double preco, int quantidade, String autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.autor = autor;
    }

    public abstract void exibirDetalhes();

    public String getAutor() { return autor; }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
