import java.util.List;

public class SistemaEmail {
    public void enviarParaTodos(List<Pessoa> lista) {
        for (Pessoa pessoa : lista) {
            System.out.println("ENVIANDO EMAIL PARA " + pessoa.getEmail());
        }   
    }
}
