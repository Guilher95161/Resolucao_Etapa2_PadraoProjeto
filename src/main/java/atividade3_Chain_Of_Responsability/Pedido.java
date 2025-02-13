package atividade3_Chain_Of_Responsability;

public class Pedido {
    String nome;
    double preco;
    public Pedido(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
