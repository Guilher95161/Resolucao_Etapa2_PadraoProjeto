package atividade2_Outra_Solucao;

public abstract class Descontavel {

    private double desconto;

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public  double getDesconto(){
        return this.desconto;
    }
    public  void   setDesconto(double desconto){
        this.desconto = desconto;
    }
    public  double precoComDesconto(){
        return (preco- preco*desconto);
    }
}
