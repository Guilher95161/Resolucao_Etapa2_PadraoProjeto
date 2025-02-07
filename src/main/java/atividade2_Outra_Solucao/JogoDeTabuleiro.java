package atividade2_Outra_Solucao;

public class JogoDeTabuleiro implements Fisico, Descontavel
{
    private double preco;
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getFormato() {
        return "Formato 4x4";
    };

    public double precoComDesconto() {
        return (this.preco - this.preco*this.desconto);
    };

}
