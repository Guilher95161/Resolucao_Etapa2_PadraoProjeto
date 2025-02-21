package atividade5_TemplateMethod;

public class PedidoDigitais extends TemplatePedido{

    public PedidoDigitais(String pedido) {
        this.nomePedido = pedido;
    }

    public  void validaPedido(){
        System.out.println("Produto Validado");
    }
    public  void calculaCustos(){
        System.out.println("Sem custo de envio e embalagem");
    }
    public  void notificaEnvio(){
        System.out.println("Download do produto em: ...");

    }
}
