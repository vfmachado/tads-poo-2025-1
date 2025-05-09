package inversaodependencia_depois;

public class ServicoSMS implements Mensageria {
    public void enviar(String msg) {
        System.out.println("ENVIANDO SMS: " + msg);
    }
}
