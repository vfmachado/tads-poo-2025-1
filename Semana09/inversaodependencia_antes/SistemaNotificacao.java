package inversaodependencia_antes;

// MODULO DE ALTO NIVEL
public class SistemaNotificacao {
    
    // MODULO DE BAIXO NIVEL
    private ServicoEmail servico = new ServicoEmail();

    public void notificar(String msg) {
        servico.enviar(msg);
    }

}
