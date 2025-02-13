package atividade3_Chain_Of_Responsability;

import java.util.ArrayList;
import java.util.List;

public class BancoDePedidos {
    private List<Pedido> pedidos;

    public BancoDePedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado ao banco de pedidos.");
    }

    public void listarPedidos() {
        System.out.println("Lista de pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}