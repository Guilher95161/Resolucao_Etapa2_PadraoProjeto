package atividade2_Solucao_Livraria;

public abstract class Item implements Descontavel {
    protected String titulo;
    protected String autor;
    protected double preco;

    public Item(String titulo, double preco, String autor) {
        this.titulo = titulo;
        this.preco = preco;
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

}
