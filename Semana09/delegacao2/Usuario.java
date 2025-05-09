package delegacao2;

public class Usuario {
    
    private String cpf;

    public Usuario(String cpf) {
        this.cpf = cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (ValidadorCpf.verifica(cpf)) {
            this.cpf = cpf;
        } else {
            throw new Exception("CPF INVALIDO");
        }
    }

    @Override
    public String toString() {
        return "Usuario com cpf " + cpf;
    }

}
