package atividade5_TemplateMethod;

public class PedidoFisico extends TemplatePedido {

    public PedidoFisico(String pedido) {
        this.nomePedido = pedido;
    }

    public  void validaPedido(){
        System.out.println("Produto Validado");
    }
    public  void calculaCustos(){
        System.out.println("Custo de envio e embalagem");
    }
    public  void notificaEnvio(){
        System.out.println("Enviando o produto para: ...");

    }
}
