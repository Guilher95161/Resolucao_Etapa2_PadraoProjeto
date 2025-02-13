package atividade3_Chain_Of_Responsability;

public class CálculoDesconto implements Handler {
    private Handler proximoHandler;

    @Override
    public void processarPedido(Pedido pedido) {
        double desconto = calcularDesconto(pedido);
        pedido.setPreco(pedido.getPreco()- pedido.getPreco()*desconto);
        System.out.println("Desconto calculado: R$" + desconto);
        if (proximoHandler != null) {
            proximoHandler.processarPedido(pedido);
        }
    }

    private double calcularDesconto(Pedido pedido) {
        if (pedido.getPreco() > 500) {
            return pedido.getPreco() * 0.10;
        }
        return 0;
    }

    @Override
    public void setProximoHandler(Handler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }
}