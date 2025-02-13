package atividade3_Chain_Of_Responsability;

public class Terminal {
    public static void main(String[] args) {
        // Criando o comprador

        // Criando o pedido
        Pedido pedido = new Pedido("comprador",  600.0);

        // Configurando a cadeia de responsabilidades
        Handler verificadorEstoque = new VerificaçãoDeEstoque();
        Handler calculoDesconto = new CálculoDesconto();
        Handler processamentoPagamento = new ProcessamentoDePagamento();
        Handler envioPedido = new EnvioPedido();

        verificadorEstoque.setProximoHandler(calculoDesconto);
        calculoDesconto.setProximoHandler(processamentoPagamento);
        processamentoPagamento.setProximoHandler(envioPedido);

        // Processando o pedido
        verificadorEstoque.processarPedido(pedido);

        // Adicionando o pedido ao banco de pedidos
        BancoDePedidos bancoDePedidos = new BancoDePedidos();
        bancoDePedidos.adicionarPedido(pedido);
        bancoDePedidos.listarPedidos();
    }
}