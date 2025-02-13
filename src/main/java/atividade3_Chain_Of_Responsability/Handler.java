package atividade3_Chain_Of_Responsability;

public interface Handler {

    public void processarPedido(Pedido pedido);

    public void setProximoHandler(Handler handler);

}
