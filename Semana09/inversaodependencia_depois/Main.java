package inversaodependencia_depois;

public class Main {
    
    public static void main(String[] args) {

        // PRINCIPIO DA SUBSTITUIÇAO DE LISKOV (LSP)
        // eu posso substituir uma subclasse sem precisar alterar o comportamento da superclasse
        SistemaNotificacao sos = new SistemaNotificacao(new ServicoSMS());
        sos.notificar("TESTE NOTIFICAO");

        sos.alterarServico(new ServicoEmail());
        sos.notificar("SEGUNDA MSG");
    }

}
