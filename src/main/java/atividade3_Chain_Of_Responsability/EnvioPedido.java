package atividade3_Chain_Of_Responsability;

public class EnvioPedido implements Handler {
    private Handler proximoHandler;

    @Override
    public void processarPedido(Pedido pedido) {
        System.out.println("Pedido enviado para o endereço: ..." );
        if (proximoHandler != null) {
            proximoHandler.processarPedido(pedido);
        }
    }

    @Override
    public void setProximoHandler(Handler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }
}