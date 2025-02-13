package atividade4_Aplicacao_Bancaria_Chain_of_Responsability;

class RespostaJSON implements Resposta {
    private Resposta proxima;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.JSON) {
            System.out.println("{ numero: " + conta.getNumero() + ", saldo:" + conta.getSaldo() + " }");
        } else if (proxima != null) {
            proxima.responde(requisicao, conta);
        }
    }

    @Override
    public void setProxima(Resposta proxima) {
        this.proxima = proxima;
    }
}
