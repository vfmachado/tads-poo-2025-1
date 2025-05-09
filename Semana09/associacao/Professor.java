package associacao;

public class Professor {
    private String nome;
    
    public Professor(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Prof " + nome;
    }
}