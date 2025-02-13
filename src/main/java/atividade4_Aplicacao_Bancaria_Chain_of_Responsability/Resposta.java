package atividade4_Aplicacao_Bancaria_Chain_of_Responsability;

public interface Resposta {
    void responde(Requisicao requisicao,Conta conta);
    void setProxima(Resposta proxima);
}
