package atividade4_Aplicacao_Bancaria_Chain_of_Responsability;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 2300);
        Requisicao requisicao = new Requisicao(Formato.XML);

        Resposta r1 = new RespostaJSON();
        Resposta r2 = new RespostaXML();
        Resposta r3 = new RespostaCSV();

        r1.setProxima(r2);
        r2.setProxima(r3);

        r1.responde(requisicao, conta);
    }
}
