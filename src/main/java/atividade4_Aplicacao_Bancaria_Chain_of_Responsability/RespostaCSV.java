package atividade4_Aplicacao_Bancaria_Chain_of_Responsability;

class RespostaCSV implements Resposta {
    private Resposta proxima;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.CSV) {
            System.out.println(conta.getNumero() + "%" + conta.getSaldo());
        } else if (proxima != null) {
            proxima.responde(requisicao, conta);
        }
    }

    @Override
    public void setProxima(Resposta proxima) {
        this.proxima = proxima;
    }
}
