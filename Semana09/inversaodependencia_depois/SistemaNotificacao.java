package inversaodependencia_depois;

// MODULO DE ALTO NIVEL
public class SistemaNotificacao {
    
    // MODULO DE BAIXO NIVEL agora é uma interface e nao uma impl concreta
    private Mensageria servico;


    public SistemaNotificacao(Mensageria servicoInjetado) {
        this.servico = servicoInjetado;
    }

    public void alterarServico(Mensageria outroServico) {
        this.servico = outroServico;
    }

    public void notificar(String msg) {
        servico.enviar(msg);
    }

}
