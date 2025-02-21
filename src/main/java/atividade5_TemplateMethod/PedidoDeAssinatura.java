package atividade5_TemplateMethod;

public class PedidoDeAssinatura extends TemplatePedido{

    public PedidoDeAssinatura(String pedido) {
        nomePedido = pedido;
    }

    public  void validaPedido(){
        System.out.println("Produto Validado");
    }
    public  void calculaCustos(){
        System.out.println("Custo de envio e embalagem e pagamentos recorrentes");
    }
    public  void notificaEnvio(){
        System.out.println("Lembre-se de renovar a assinatura!!");

    }
}
