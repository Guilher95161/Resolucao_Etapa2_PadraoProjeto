package atividade5_TemplateMethod;

public abstract class TemplatePedido {
    protected String nomePedido;
    public void processaPedido(){
        validaPedido();
        calculaCustos();
        notificaEnvio();

    }
    public abstract void validaPedido();
    public abstract void calculaCustos();
    public abstract void notificaEnvio();
}
