package inversaodependencia_depois;

public class ServicoEmail implements Mensageria {
    public void enviar(String msg) {
        System.out.println("ENVIANDO EMAIL: " + msg);
    }
}
