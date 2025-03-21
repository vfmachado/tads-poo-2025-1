import java.util.ArrayList;
import java.util.List;

public class Usuario {
 
    // atributos
    private String nome;
    private String cpf;
    private String senha;
    private String email;

    private List<Endereco> enderecos;

    Usuario(String email) {
        // falta validacao
        this.email = email;
        this.enderecos = new ArrayList<Endereco>();
    }

    public void addEndereco(Endereco endereco) {
        // POSSO ADICIONAR 2 VEZES O MESMO ENDERECO?
        // NAO DEVERIA, MASSS A VIDA COMO ELA É
        this.enderecos.add(endereco);
    }

    public String toString() {
        String resultado =  this.email;
        if (enderecos.size() > 0 ) {
            for (Endereco endereco : enderecos) {
                resultado += "\n\n#Endereco:";
                resultado += "\n" + endereco;
            }
        }
        return resultado;
    }
    
}
