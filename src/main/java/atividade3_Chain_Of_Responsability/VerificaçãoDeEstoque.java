package atividade3_Chain_Of_Responsability;

public class VerificaçãoDeEstoque implements Handler {
        private Handler proximoHandler;

        @Override
        public void processarPedido(Pedido pedido) {
            if (verificarEstoque(pedido)) {
                System.out.println("Estoque verificado com sucesso.");
                if (proximoHandler != null) {
                    proximoHandler.processarPedido(pedido);
                }
            } else {
                System.out.println("Falha na verificação de estoque. Pedido cancelado.");
            }
        }

        private boolean verificarEstoque(Pedido pedido) {
            // Simulação de verificação de estoque
            return true; // Estoque disponível
        }

        @Override
        public void setProximoHandler(Handler proximoHandler) {
            this.proximoHandler = proximoHandler;
        }
}
