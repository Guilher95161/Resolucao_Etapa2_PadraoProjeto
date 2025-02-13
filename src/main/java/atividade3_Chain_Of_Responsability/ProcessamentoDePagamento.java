package atividade3_Chain_Of_Responsability;

public class ProcessamentoDePagamento implements Handler {
    private Handler proximoHandler;

    @Override
    public void processarPedido(Pedido pedido) {
        if (processarPagamento(pedido)) {
            System.out.println("Pagamento processado com sucesso.");
            if (proximoHandler != null) {
                proximoHandler.processarPedido(pedido);
            }
        } else {
            System.out.println("Falha no processamento do pagamento. Pedido cancelado.");
        }
    }

    private boolean processarPagamento(Pedido pedido) {
        // Simulação de processamento de pagamento
        return true; // Pagamento bem-sucedido
    }

    @Override
    public void setProximoHandler(Handler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }
}