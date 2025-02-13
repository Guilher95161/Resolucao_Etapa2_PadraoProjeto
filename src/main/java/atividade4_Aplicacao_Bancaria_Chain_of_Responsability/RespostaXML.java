package atividade4_Aplicacao_Bancaria_Chain_of_Responsability;

class RespostaXML implements Resposta {
    private Resposta proxima;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.XML) {
            System.out.println("<conta><numero>" + conta.getNumero() + "</numero><saldo>" + conta.getSaldo() + "</saldo></conta>");
        } else if (proxima != null) {
            proxima.responde(requisicao, conta);
        }
    }

    @Override
    public void setProxima(Resposta proxima) {
        this.proxima = proxima;
    }
}